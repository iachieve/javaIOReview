package dev.practice.one;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ACFileOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("myFile.txt"), true);
            while(true){
                int input = System.in.read();
                if(input == 10) break;
                else fileOutputStream.write(input);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
