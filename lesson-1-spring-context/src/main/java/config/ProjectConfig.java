package config;

import beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Configuration
// Component scan musi być zdeklarowany gdy tworzymy z @Component.
@ComponentScan(basePackages = {"beans", "repositories", "services"})
public class ProjectConfig {

    @Bean("A")
    public MyBean myBean() {
        MyBean bean = new MyBean();
        bean.setText("This bean");
        return bean;
    }


    @Bean("B")
    public MyBean myBean2() {
        MyBean bean = new MyBean();
        bean.setText("This bean2");
        return bean;
    }
}
