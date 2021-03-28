package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean(name = "gs1") // This method returns a bean which must be registered as a bean
    @Scope(value = "singleton")
    public GreetingService getGs1() {
        GreetingServiceImpl gs = new GreetingServiceImpl();
        gs.setGreeting("Good Morning");
        return gs;
    }

    @Bean(name = "gs2")
    public GreetingService getGs2() {
        GreetingServiceImpl gs = new GreetingServiceImpl("Good Evening");
        return gs;
    }
}
