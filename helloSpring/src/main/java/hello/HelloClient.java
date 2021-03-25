package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloClient {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        // @Bean(name="gs#")
        GreetingService gs1 = (GreetingService) factory.getBean("gs1");
        GreetingService gs2 = (GreetingService) factory.getBean("gs2");

        gs1.sayGreeting();
        gs2.sayGreeting();
    }

}
