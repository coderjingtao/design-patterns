package com.joseph.designpatterns.initsolution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 如果我们只是想简单的获取以空格分隔的命令行参数，那 MyCommandLineRunner 就足够使用了
 * java -jar design-patterns-0.0.1-SNAPSHOT.jar my name is joseph
 * @author Joseph.Liu
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner running...");
        for(String arg : args){
            System.out.println(arg);
        }
    }
}
