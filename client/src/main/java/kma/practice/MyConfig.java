package kma.practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("kma.practice")
@Configuration
public class MyConfig {

    @Bean
    @ConditionalOnBean(CustomServiceImplementation.class)
    public InitBeanExample initBean(){
        return new InitBeanExample();
    }

    @Bean
    @ConditionalOnMissingBean(LibraryOpco.class)
    public DefaultLibrary defaultService(){
        return new DefaultLibrary();
    }

    @Bean
    @ConditionalOnBean(LibraryOpco.class)
    public LibraryService libraryService(){
        return new LibraryService();
    }
}
