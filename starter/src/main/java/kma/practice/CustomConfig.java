package kma.practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfig {

    @Bean
    @ConditionalOnProperty(prefix = "custom", name = "property", havingValue = "email")
    public CustomService customServiceImpl(){
        return new CustomServiceImplementation();
    }

    @Bean
    @ConditionalOnProperty(prefix = "library", name = "service", havingValue = "true")
    public LibraryOpco libraryServiceImpl(){
        return new LibraryOpco();
    }

}
