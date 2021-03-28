package hello;

public class GreetingServiceImpl implements GreetingService {
    private String greeting;

    // Default Constructor
    public GreetingServiceImpl() {
    }

    // Argumented constructor
    public GreetingServiceImpl(String greeting) {
        this.greeting = greeting;
    }

    // Getters and Setters

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return this.greeting;
    }

    // Implement the GreetingService interface
    @Override
    public void sayGreeting() {
        System.out.println("Hello " + greeting);
    }

}
