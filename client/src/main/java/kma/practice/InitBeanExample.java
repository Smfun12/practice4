package kma.practice;

import org.springframework.beans.factory.InitializingBean;

public class InitBeanExample implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("sad");
    }
}
