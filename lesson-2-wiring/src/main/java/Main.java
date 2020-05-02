import beans.Cat;
import beans.Owner;
import config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfiguration.class)) {
//            Cat cat = ctx.getBean(Cat.class);
            Owner owner = ctx.getBean(Owner.class);

            System.out.println(owner);
//            System.out.println(cat);
        }
    }
}
