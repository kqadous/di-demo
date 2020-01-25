package hero.springframework.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi() {
        return "Hi- using setter greeting service";
    }
}
