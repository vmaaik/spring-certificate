package aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
}
