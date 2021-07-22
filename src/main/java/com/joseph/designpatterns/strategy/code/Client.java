package com.joseph.designpatterns.strategy.code;

import com.joseph.designpatterns.strategy.code.operations.AddOperate;
import com.joseph.designpatterns.strategy.code.operations.DivOperate;
import com.joseph.designpatterns.strategy.code.operations.MulOperate;
import com.joseph.designpatterns.strategy.code.operations.SubOperate;

public class Client {
    public static void main(String[] args) {
        int a = 4, b = 2;
        Calculator calculatorAdd = new Calculator(new AddOperate());
        System.out.println("a + b = "+calculatorAdd.execute(a, b));
        Calculator calculatorSub = new Calculator(new SubOperate());
        System.out.println("a - b = "+calculatorSub.execute(a, b));
        Calculator calculatorMul = new Calculator(new MulOperate());
        System.out.println("a x b = "+calculatorMul.execute(a, b));
        Calculator calculatorDiv = new Calculator(new DivOperate());
        System.out.println("a / b = "+calculatorDiv.execute(a, b));
    }
}
