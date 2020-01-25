package hero.springframework.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi() {
        return "Hi - Primary greeting service";
    }
}
