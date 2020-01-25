package hero.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceimpl implements GreetingService {
    @Override
    public String sayHi() {
        return "Hi- using constructor greeting service";
    }
}
