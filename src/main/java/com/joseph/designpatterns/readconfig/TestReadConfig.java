package com.joseph.designpatterns.readconfig;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestReadConfig implements InitializingBean {

    private final AliPayBean aliPayBean;

    private final GetMyProperties getMyProperties;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(aliPayBean);
        System.out.println(getMyProperties.getMyProperties());
    }
}
