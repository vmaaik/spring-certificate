package main;

import beans.MyBean;
import beans.Second;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductDeliveryService;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            MyBean b1 = context.getBean("A", MyBean.class);
            MyBean b2= context.getBean("B", MyBean.class);

            ProductDeliveryService productDeliveryService = context.getBean(ProductDeliveryService.class);
            productDeliveryService.addSomeProducts();

            Second second = context.getBean(Second.class);
            System.out.println(second.getText());
            System.out.println(second);
            System.out.println(b1.getText());
            System.out.println(b2.getText());
        }
    }
}
