package com.joseph.designpatterns.decorator.code;

public class Client {
    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource("123456");
        dataSource.writeData();
        dataSource.readData();
//        new CompressionDecorator(new EncryptionDecorator(new DataSourceDecorator(dataSource))).writeData();
    }
}
