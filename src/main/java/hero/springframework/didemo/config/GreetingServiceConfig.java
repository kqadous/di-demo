package hero.springframework.didemo.config;

import hero.springframework.didemo.repositories.GreetingRepository;
import hero.springframework.didemo.service.GreetingService;
import hero.springframework.didemo.service.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {

        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile("ar")
    public GreetingService primaryArabicGreetingService(GreetingServiceFactory greetingServiceFactory) {

        return greetingServiceFactory.createGreetingService("ar");
    }

    @Bean
    @Primary
    @Profile({"en" , "default"})
    public GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {

        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("ind")
    public GreetingService primaryIndianGreetingService(GreetingServiceFactory greetingServiceFactory) {

        return greetingServiceFactory.createGreetingService("ind");
    }
}
