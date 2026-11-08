package com.example.testing;

import com.example.autoconfig.greeting.GreetingAutoConfiguration;
import com.example.autoconfig.greeting.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 1) exclude (uses .class — when the class IS on your classpath):
// @SpringBootApplication(exclude = { GreetingAutoConfiguration.class })
//
// 2) excludeName (uses String — when the class might NOT be on your classpath):
// @SpringBootApplication(excludeName = { "com.example.autoconfig.greeting.GreetingAutoConfiguration" })
@SpringBootApplication
public class TestingApplication {

	private final GreetingService greetingService;

	public TestingApplication(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	@RequestMapping("/")
	String home() {
		return greetingService.sayHello();
	}

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}

}
