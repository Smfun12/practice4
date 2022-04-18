package kma.practice;

import org.springframework.beans.factory.InitializingBean;

public class DefaultLibrary implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("No special library service was passed");
    }
}
