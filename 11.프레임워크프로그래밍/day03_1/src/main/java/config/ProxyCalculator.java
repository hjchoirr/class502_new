package config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;


@Aspect
public class ProxyCalculator {

    @Pointcut("execution(* exam01..*(..))")  //공통기능이 적용될 범위 : exam01 패키지의 모든 메서드->
    public void publicTarget() {
        System.out.println("publicTarget()");
    }

    @Before("publicTarget()")
    public void before(JoinPoint joinPoint) {
        System.out.println("Before..");
    }

    @After("publicTarget()")
    public void after(JoinPoint joinPoint) {
        System.out.println("After..");
    }

    @AfterReturning(value= "publicTarget()", returning = "returnValue")
    public void afterReturning(JoinPoint joinPoint, Object returnValue) throws Throwable{
        System.out.println("AfterReturning.." + returnValue);
    }


    @AfterThrowing(value="publicTarget()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("AfterThrowing..");
        e.printStackTrace();
    }

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        Signature sig = joinPoint.getSignature();
        System.out.println("joinPoint.getSignature() :" + sig.toLongString());

        Object[] args = joinPoint.getArgs();
        System.out.println("joinPoint.getArgs() :" + Arrays.toString(args));

        Object obj = joinPoint.getTarget();
        System.out.println("joinPoint.getTarget() : " + obj.getClass());

        long stime = System.nanoTime();    //공통기능
        try {
            Object result = joinPoint.proceed(); // 핵심기능을 대신 수행해줌
            boolean re = false;
            return result;
        }finally {
            long etime = System.nanoTime();  //공통기능
            System.out.println("걸린시간:" + (etime - stime));
        }
    }
}
