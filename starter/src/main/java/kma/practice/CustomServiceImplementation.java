package kma.practice;

import org.springframework.beans.factory.InitializingBean;

public class CustomServiceImplementation implements CustomService, InitializingBean {
    @Override
    public void doService() {
        System.out.println("I am born today in Ukraine in CustomServiceImplementation");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        doService();
    }
}
