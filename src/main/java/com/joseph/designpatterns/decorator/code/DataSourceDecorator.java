package com.joseph.designpatterns.decorator.code;

public class DataSourceDecorator implements DataSource{

    private final DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public void writeData() {
        this.dataSource.writeData();
    }

    public void readData() {
        this.dataSource.readData();
    }
}
