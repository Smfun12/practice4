package kma.practice;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;


public class LibraryService implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("LibraryOpco bean passed here");
    }
}
