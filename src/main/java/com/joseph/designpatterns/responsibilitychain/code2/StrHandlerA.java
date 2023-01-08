package com.joseph.designpatterns.responsibilitychain.code2;

public class StrHandlerA extends Handler<String>{
    @Override
    protected String doHandle(String input) {
        return "StrHandlerA is processing " + input;
    }
}
