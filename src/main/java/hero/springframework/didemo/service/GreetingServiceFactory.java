package hero.springframework.didemo.service;

import hero.springframework.didemo.repositories.GreetingRepository;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lan) {

        switch (lan) {
            case "ar":
                return new PrimaryArabicGreetingServiceImpl(greetingRepository);
            case "ind":
                return new PrimaryIndianGreetingServiceImpl(greetingRepository);

            case "en":
            default:
                return new PrimaryGreetingServiceImpl(greetingRepository);

        }
    }
}
