package com.joseph.designpatterns.responsibilitychain.practice;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Joseph.Liu
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ValidateHandlerChain implements InitializingBean {

    private final ApplicationContext applicationContext;

    private List<ValidateHandler> allHandlers = new ArrayList<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化ValidateHandlerChain完成");
        //获取IOC容器中 类型为 ValidateHandler 的 Bean,也就是 NotNullValidateHandler 和 MinNumberValidateHandler
        Map<String, ValidateHandler> beansOfType = applicationContext.getBeansOfType(ValidateHandler.class);
        //把所有handler添加到变量allHandlers
        beansOfType.forEach((key,val) -> allHandlers.add(val));
    }

    public List<Object> validate(List<Object> allRequests){
        List<Object> validatedList = null;
        for(ValidateHandler validateHandler : allHandlers){
            validatedList = validateHandler.validate(allRequests);
            //如果已经没有校验成功的数据，直接返回
            if(validatedList.size() == 0){
                return validatedList;
            }
        }
        return validatedList;
    }
}
