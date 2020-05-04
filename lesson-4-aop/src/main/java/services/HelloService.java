package services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private String serviceField;

    private int serviceField2;

    public int getServiceField2() {
        return serviceField2;
    }

    public void setServiceField2(int serviceField2) {
        this.serviceField2 = serviceField2;
    }

    public String getServiceField() {
        return serviceField;
    }

    public void setServiceField(String serviceField) {
        this.serviceField = serviceField;
    }

    public void hello(String name) {
        System.out.println("Hello " + name);
        throw new RuntimeException("omg!");
    }

    public String hello2(String name) {
        System.out.println("Method hello2 executed");
        return name;
    }
}
