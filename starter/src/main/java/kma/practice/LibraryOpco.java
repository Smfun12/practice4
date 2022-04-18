package kma.practice;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class LibraryOpco implements InitializingBean {

    public void message(){
        System.out.println("library opco");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        message();
    }
}
