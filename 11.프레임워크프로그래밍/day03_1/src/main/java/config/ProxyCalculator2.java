package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class ProxyCalculator2 {

    /*
    @Pointcut("execution(* exam01..*(..))")
    public void publicTarget() {

    }
     */
    //@Around("publicTarget()")
    //@Around("execution(* exam01..*(..))")
    @Around("config.ProxyCache.publicTarget()") // ProxyCache.publicTarget() 가 현재 패키지에 있으면 패키지명 생략가능
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {
        long stime = System.nanoTime();

        try {
            Object result = joinPoint.proceed();
            return result;
        }finally {
            long etime = System.nanoTime();
            System.out.println("걸린시간 : " + (etime - stime));
        }
    }



}
