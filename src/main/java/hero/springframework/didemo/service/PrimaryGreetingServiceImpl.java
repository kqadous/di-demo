package hero.springframework.didemo.service;

import hero.springframework.didemo.repositories.GreetingRepository;

public class PrimaryGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHi() {
        return greetingRepository.getEnglishGreeting();
    }
}
