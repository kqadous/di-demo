package hero.springframework.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("ar")
public class PrimaryArabicGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi() {
        return "السلام عليكم ورحمة الله";
    }
}
