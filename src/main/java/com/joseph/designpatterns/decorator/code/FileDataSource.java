package com.joseph.designpatterns.decorator.code;

public class FileDataSource implements DataSource{

    private final String data;

    public FileDataSource(String data){
        this.data = data;
    }

    @Override
    public void writeData() {
        System.out.println(this.data + " written into File");
    }

    @Override
    public void readData() {
        System.out.println("read " + this.data);
    }
}
