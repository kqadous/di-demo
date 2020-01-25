package hero.springframework.didemo.controllers;

import hero.springframework.didemo.service.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello() {

        return greetingService.sayHi();
    }
}
