package hero.springframework.didemo.config;

import hero.springframework.didemo.beans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"classpath:datasource.properties"})
public class PropertyConfig {

    @Autowired
    private Environment env;

    @Value("${hero.username}")
    private String username;

    @Value("${hero.password}")
    private String password;

    @Value("${hero.dburl}")
    private String dbURL;

    @Bean
    public FakeDataSource fakeDataSource() {

        FakeDataSource fakeDataSource = new FakeDataSource();

        fakeDataSource.setUsername(username);
        fakeDataSource.setPassword(password);
//        fakeDataSource.setDbURL(dbURL);
        fakeDataSource.setDbURL(env.getProperty("HERO-DBURL"));

        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {

        return new PropertySourcesPlaceholderConfigurer();
    }
}
