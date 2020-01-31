package hero.springframework.didemo.service;

import hero.springframework.didemo.repositories.GreetingRepository;

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
