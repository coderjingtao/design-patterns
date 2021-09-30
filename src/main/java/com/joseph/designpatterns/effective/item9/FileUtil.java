package com.joseph.designpatterns.effective.item9;

import java.io.*;

/**
 * Item9: 使用try-with-resources语句替代try-finally语句
 * @author Joseph.Liu
 */
public class FileUtil {

    public void doGet() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("C:/data.txt"))){
            for(String line = br.readLine(); line !=null; line = br.readLine()){
                System.out.println(line);
            }
        }
    }

    public void doPost() throws IOException {

        try(InputStream input = new FileInputStream(new File("C:/data.txt"));
            OutputStream output = new FileOutputStream(new File("C:/copy.txt"))){
            byte[] data = new byte[1024];
            int length = -1;
            while( (length = input.read(data)) != -1){
                output.write(data,0,length);
            }
        }
    }
}
