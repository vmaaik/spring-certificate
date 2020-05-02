package main;

import config.ProjectConfig;
import model.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

public class Main {

    public static void main(String[] args) {
        try(var a = new AnnotationConfigApplicationContext(ProjectConfig.class)){

            ProductRepository productRepository = a.getBean(ProductRepository.class);
            Product p = new Product();
            p.setName("Test");
            p.setPrice(123.00);

//            productRepository.addProduct(p);
            System.out.println(productRepository.getProducts());

        }
    }
}
