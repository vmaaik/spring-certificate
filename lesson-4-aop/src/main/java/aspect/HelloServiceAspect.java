package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloServiceAspect {

    @Before("execution(* services.HelloService.hello(..))")
    public void before() {
        System.out.println("Before advice has been executed");
    }

    @After("execution(* services.HelloService.hello(..))")
    public void after() {
        System.out.println("After advice has been executed");
    }

    @AfterReturning("execution(* services.HelloService.hello(..))")
    public void afterReturning() {
        System.out.println("After returning");
    }

    @AfterThrowing("execution(* services.HelloService.hello(..))")
    public void afterThrowing() {
        System.out.println("After Throwing");
    }

//    // Return value skipped
//    @Around("execution(* services.HelloService.around(..))")
//    public Object skipAround(ProceedingJoinPoint joinPoint) {
//        System.out.println("Execution of around method in HelloService skipped");
//        return "Return value skipped";
//    }

    @Around("execution(* services.HelloService.hello2(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around step before");
        Object result = joinPoint.proceed();
        System.out.println("Around step after");
        return result;
    }
}
