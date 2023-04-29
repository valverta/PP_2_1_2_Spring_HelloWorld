import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean.equals(applicationContext.getBean(HelloWorld.class)));
        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(cat.equals(applicationContext.getBean(Cat.class)));
    }
}