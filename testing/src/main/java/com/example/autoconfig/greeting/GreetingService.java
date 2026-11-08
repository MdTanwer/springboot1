package com.example.autoconfig.greeting;

// Notice: NO @Service or @Component here!
public class GreetingService {

    private final String message;

    // Default message (used by @AutoConfiguration)
    public GreetingService() {
        this.message = "Hello from @AutoConfiguration (Default)!";
    }

    // Custom message (used by your own @Configuration)
    public GreetingService(String message) {
        this.message = message;
    }

    public String sayHello() {
        return message;
    }
}
