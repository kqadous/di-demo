package hero.springframework.didemo.service;

import hero.springframework.didemo.repositories.GreetingRepository;

public class PrimaryArabicGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryArabicGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHi() {
        return greetingRepository.getArabicGreeting();
    }
}
