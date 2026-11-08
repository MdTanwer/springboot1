package com.example.testing;

import com.example.autoconfig.greeting.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCustomConfig {

    @Bean
    public GreetingService customGreetingService() {
        return new GreetingService("Hello from MY @Configuration (Custom Override)!");
    }
}

