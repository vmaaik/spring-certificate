package services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void hello(String name) {
        System.out.println("Hello " + name);
//        throw new RuntimeException("omg!");
    }

    public String hello2(String name) {
        System.out.println("Method hello2 executed");
        return name;
    }
}
