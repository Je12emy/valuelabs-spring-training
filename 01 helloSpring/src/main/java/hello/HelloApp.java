package hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        // Can't store the xml file in the same dir as this class only in main/resources
        // source
        // https://stackoverflow.com/questions/5939959/ioexception-parsing-xml-document-from-class-path-resource
        // Spring container
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory factory = applicationContext;

        // Spring framework
        GreetingService gs1 = (GreetingService) factory.getBean("gs1");
        GreetingService gs2 = (GreetingService) factory.getBean("gs2");

        gs1.sayGreeting();
        gs2.sayGreeting();
    }
}
