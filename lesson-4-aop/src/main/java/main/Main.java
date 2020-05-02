package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.HelloService;

public class Main {

    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            HelloService service = ctx.getBean(HelloService.class);
            service.hello("John");
        }
    }
}
