package com.joseph.designpatterns.effective.item4;

/**
 * 通过私有的构造方法来阻止类的实例化
 * Noninstantiable utility class
 * @author Joseph.Liu
 */
public class UtilityClass {

    /**
     * Suppress default constructor for noninstantiability
     */
    private UtilityClass() {
        throw new AssertionError();
    }
    // Remainder omitted
}
