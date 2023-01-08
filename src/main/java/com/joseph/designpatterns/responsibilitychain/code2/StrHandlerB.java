package com.joseph.designpatterns.responsibilitychain.code2;

public class StrHandlerB extends Handler<String>{
    @Override
    protected String doHandle(String input) {
        return "StrHandlerB is processing " + input;
    }
}
