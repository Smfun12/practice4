package kma.practice;

import org.springframework.beans.factory.InitializingBean;

public class LibrarySample implements InitializingBean {

    public void printMessage(){
        System.out.println("Hello from Ukraine, library sample!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        printMessage();
    }
}
