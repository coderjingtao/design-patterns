package com.joseph.designpatterns.decorator.code;

public class EncryptionDecorator implements DataSource{

    private final DataSource dataSource;
    public EncryptionDecorator(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void writeData() {
        System.out.println("EncryptionDecorator write start..");
        this.dataSource.writeData();
        System.out.println("EncryptionDecorator write end.");
    }

    public void readData() {
        System.out.println("EncryptionDecorator read start..");
        this.dataSource.readData();
        System.out.println("EncryptionDecorator read end.");
    }
}
