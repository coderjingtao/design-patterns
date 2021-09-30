package com.joseph.designpatterns.effective.item17;

/**
 * 可以通过使类用 final 修饰，
 * 但是还有另外一个更灵活的选择。 而不是使不可变类设置为 final，可以使其所有的构造方法私有或包级私有，并添加公共静态工厂，而不是公共构造方法
 * @author Joseph.Liu
 */
public class ImmutableClass2 {
    private final int[] myArray;

    private ImmutableClass2(int[] myArray){
        this.myArray = myArray.clone();
    }

    public static ImmutableClass2 valueOf(int[] myArray){
        return new ImmutableClass2(myArray);
    }

    public int[] getMyArray(){
        return this.myArray.clone();
    }
}
