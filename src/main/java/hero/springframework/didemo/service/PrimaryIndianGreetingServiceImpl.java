package hero.springframework.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("ind")
public class PrimaryIndianGreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi() {
        return "नमस्ते - प्राथमिक ग्रीटिंग सेवा";
    }
}
