package hero.springframework.didemo.controllers;

import hero.springframework.didemo.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {

        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {

        assertEquals(GreetingServiceImpl.HELLO_GURUS , setterInjectedController.sayHello());
    }
}