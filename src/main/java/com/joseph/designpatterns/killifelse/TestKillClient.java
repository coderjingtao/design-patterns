package com.joseph.designpatterns.killifelse;

import org.springframework.util.ReflectionUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * 使用Function函数式编程的新方式来处理 if else 多分支语句
 * Function是一个接口,它完整的样子是这样: Function<T,R>,其中T表示接受一个T类型的入参,R表示返回一个R类型的出参,
 * 注意: 既然入参和出参都是一个泛型,那就说明可以适用于任何种类的方法,
 * 如果方法需要多个入参,可以把它们封装成T类型的入参VO,
 * 如果出参也需要有多个参数,也可以把它们封装为一个R类型的出参VO
 *
 * Map<String, 函数/表达式>=======> 通过一个数据可以获取一个方法
 *
 * @author Joseph.Liu
 */
public class TestKillClient {

    private Map<String, Function<String,String>> functionMap = new HashMap<>();

    public void initFunctionMapping(){
        functionMap.put("AMZN", channel -> {
            System.out.println(channel);
            return "This is a simple function to process "+ channel;
        });
        functionMap.put("CDMK", channel -> {
            System.out.println(channel);
            return "This is a simple function to process "+ channel;
        });

        functionMap.put("EOPL", this::complicatedFunctionSample);

    }

    private String complicatedFunctionSample(String channel){
        System.out.println(channel);
        return "This is a complicated function to process "+channel;
    }

    public String execute(String channelName){
        Function<String, String> function = this.functionMap.get(channelName);
        String result = function.apply(channelName);
        return result;
    }

    public static void main(String[] args) {
        TestKillClient testKillClient = new TestKillClient();
        testKillClient.initFunctionMapping();
        System.out.println(testKillClient.execute("AMZN"));
        System.out.println(testKillClient.execute("CDMK"));
        System.out.println(testKillClient.execute("EOPL"));

        ReflectionUtils.clearCache();
    }

}
