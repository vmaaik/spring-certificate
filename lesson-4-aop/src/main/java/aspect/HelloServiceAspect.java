package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    @Pointcut("execution(* services.HelloService.*(..))")
    public void log() {
    }

    @Pointcut("execution(public * set*(..))")
    public void setters() {
    }

    @Pointcut("execution(public * get*(..))")
    public void getters() {

    }

    @After("setters() || getters()")
    public void gettersAndSetters(JoinPoint joinPoint) throws Throwable {
        System.out.println("Method " + joinPoint.getSignature().getName() + " called");
    }

//    @After("getters()")
//    public void gettersAndSetters(JoinPoint joinPoint) throws Throwable {
//        System.out.println("Attempting to get : " + joinPoint.getArgs()[0] + " in " + joinPoint.getSignature().getName());
//    }


//    @Before("execution(* services.HelloService.hello(..))")
//    public void before() {
//        System.out.println("Before advice has been executed");
//    }
//
//    @After("execution(* services.HelloService.hello(..))")
//    public void after() {
//        System.out.println("After advice has been executed");
//    }
//
//    @AfterReturning("execution(* services.HelloService.hello(..))")
//    public void afterReturning() {
//        System.out.println("After returning");
//    }
//
//    @AfterThrowing("execution(* services.HelloService.hello(..))")
//    public void afterThrowing() {
//        System.out.println("After Throwing");
//    }

    // Return value skipped
//    @Around("execution(* services.HelloService.around(..))")
//    public Object skipAround(ProceedingJoinPoint joinPoint) {
//        System.out.println("Execution of around method in HelloService skipped");
//        return "Return value skipped";
//    }

//    @Around("log()")
//    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("Attempting to execute: " + joinPoint.getSignature());
//        Object result = joinPoint.proceed();
//        System.out.println("Result " + result);
//    }
}
