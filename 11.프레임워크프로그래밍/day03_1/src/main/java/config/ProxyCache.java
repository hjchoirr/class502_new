package config;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.HashMap;
import java.util.Map;

@Aspect
@Order(1)
public class ProxyCache {
    private Map<Long, Object> data = new HashMap<>();

    @Pointcut("execution(* exam01..*(..))")
    public void publicTarget() {

    }
    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Long num = (Long)args[0];

        if(data.containsKey(num)) {
            System.out.println("Cache 사용..");
            Object result = data.get(num);
            return result;
        }

        Object result = joinPoint.proceed();
        data.put(num, result);
        System.out.println("캐시 저장..");
        return result;
    }
}
