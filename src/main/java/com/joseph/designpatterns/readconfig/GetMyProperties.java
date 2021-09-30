package com.joseph.designpatterns.readconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 如果不加@PropertySource来指定特定的属性文件，默认会读取application.properties
 * @Value 只适合简单的属性值
 */
@Configuration
@PropertySource("classpath:/my.properties")
public class GetMyProperties {

    @Value("${my.config.user.name}")
    private String name;
    @Value("${my.config.user.age}")
    private int age;

    public String getMyProperties(){
        return name + " : " + age;
    }

}
