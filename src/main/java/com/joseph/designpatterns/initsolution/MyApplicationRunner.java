package com.joseph.designpatterns.initsolution;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * ApplicationRunner 可以通过 run 方法的 ApplicationArguments 对象解析出命令行参数，并且每个参数可以有多个值在里面，因为 getOptionValues 方法返回 List数组
 * java -jar design-patterns-0.0.1-SNAPSHOT.jar --name=Joseph
 * @author Joseph.Liu
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("MyApplicationRunner running...");
        System.out.println("name = " + args.getOptionValues("name"));
    }
}
