package rezza.vega.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rezza.vega.service.GreetingService;

@Component
public class GreetingController {

    private final GreetingService greetingService;

    // Constructor Injection
    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void sayHello() {
        System.out.println(greetingService.greet());
    }
}
