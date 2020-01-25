package hero.springframework.didemo.controllers;

import hero.springframework.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;


    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceimpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayHi();
    }
}
