package dev.practice.one;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AAReadLineByLine {

    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("myFile.txt");
            while (true){
                int data = inputStream.read();
                if(data == -1){
                    System.out.println("End of stream");
                    break;
                }
                System.out.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.flush();
        }
    }
}
