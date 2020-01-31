package hero.springframework.didemo.service;

import hero.springframework.didemo.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("ind")
public class PrimaryIndianGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryIndianGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHi() {
        return greetingRepository.getIndianGreeting();
    }
}
