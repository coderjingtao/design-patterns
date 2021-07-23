package com.joseph.designpatterns.initsolution;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * InitializingBean.afterPropertiesSet 解决方案比使用 @PostConstruct 更安全，
 * 因为如果我们依赖尚未自动注入的 @Autowired 字段，则 @PostConstruct 方法可能会遇到 NullPointerExceptions
 * @author Joseph.Liu
 */
@Component
public class MyInitializingBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyInitializingBean.afterPropertiesSet() running...");
    }
}
