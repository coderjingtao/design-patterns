package com.joseph.designpatterns.effective.item17;

/**
 * @author Joseph.Liu
 */
public final class ImmutableClass {
    private final int[] myArray;

    public ImmutableClass(int[] myArray){
        this.myArray = myArray.clone();
    }

    public int[] getMyArray(){
        return this.myArray.clone();
    }
}
