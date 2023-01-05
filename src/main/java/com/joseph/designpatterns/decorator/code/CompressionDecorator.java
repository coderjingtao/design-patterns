package com.joseph.designpatterns.decorator.code;

public class CompressionDecorator implements DataSource {

    private final DataSourceDecorator decorator;

    public CompressionDecorator(DataSourceDecorator decorator){
        this.decorator = decorator;
    }

    public void writeData() {
        System.out.println("CompressionDecorator write start..");
        this.decorator.writeData();
        System.out.println("CompressionDecorator write end.");
    }

    public void readData() {
        System.out.println("CompressionDecorator read start..");
        this.decorator.readData();
        System.out.println("CompressionDecorator read end.");
    }
}
