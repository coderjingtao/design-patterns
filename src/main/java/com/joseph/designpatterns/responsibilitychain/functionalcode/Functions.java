package com.joseph.designpatterns.responsibilitychain.functionalcode;

import java.util.function.UnaryOperator;

public class Functions {
    public static UnaryOperator<String> StrHandlerA = input -> "StrHandlerA is processing " + input;
    public static UnaryOperator<String> StrHandlerB = input -> "StrHandlerB is processing " + input;
}
