package kma.practice;

import org.springframework.beans.factory.InitializingBean;

public class CustomServiceImpl implements CustomService, InitializingBean {
    @Override
    public void doService() {
        System.out.println("Hello from CustomServiceImpl");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        doService();
    }
}
