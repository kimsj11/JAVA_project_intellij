package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead_Basic {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[4096];
        FileInputStream inputStream = new FileInputStream("/Users/sungjin/IdeaProjects/ch12-java/out.txt");
        inputStream.read(b);
        System.out.println(new String(b));
        inputStream.close();
    }
}
