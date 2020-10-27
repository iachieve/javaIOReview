package dev.practice.one;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ABReadBytes {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("myFile.txt");
            byte[] data = new byte[inputStream.available()];
            inputStream.read(data);
            System.out.println();
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.flush();

        }
    }
}
