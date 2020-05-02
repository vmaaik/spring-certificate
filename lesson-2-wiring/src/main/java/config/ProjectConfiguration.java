package config;

import beans.Cat;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("beans")
public class ProjectConfiguration {

    //    Autowiring w konfiguracji poprzez @BEAN
//    @Bean
//    @Qualifier("cat2")
//    public Cat cat() {
//        Cat c = new Cat();
//        c.setName("Tom");
//        return c;
//    }
//
//    @Bean
//    @Qualifier("cat1")
//    public Cat cat2() {
//        Cat c = new Cat();
//        c.setName("Tom");
//        return c;
//    }

//    @Bean
//    public Owner owner(Cat cat) {
//        Owner o =  new Owner();
//         o.setCat(cat);
//         return o;
//    }


}
