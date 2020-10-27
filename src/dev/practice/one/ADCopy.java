package dev.practice.one;

import java.io.*;

public class ADCopy {
    public static void main(String[] args) {
        FileInputStream fIn;
        FileOutputStream fOut;

        try {
            fIn = new FileInputStream("./TextFiles/first.txt");
            fOut = new FileOutputStream(new File("./TextFiles/second.txt"), true);
            byte[] data = fIn.readAllBytes();
            fOut.write(data);
            fIn.close();
            fOut.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
