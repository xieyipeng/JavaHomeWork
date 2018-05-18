package test7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture2 {
    public static void main(String[] args) throws IOException {
        File fileFrom = new File("F:\\copy\\befor\\IMG201704021023301.jpg");
        File fileTo = new File("F:\\copy\\after\\copy_after.jpg");
        if (!fileTo.exists()){
            fileTo.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(fileFrom);
        FileOutputStream fileOutputStream = new FileOutputStream(fileTo);
        byte[] bytes=new byte[1024];
        int bytesRead;
        while ((bytesRead = fileInputStream.read(bytes)) > 0) {
            fileOutputStream.write(bytes, 0, bytesRead);
            System.out.println("bytes  "+bytes);
            System.out.println("bytesRead  "+bytesRead);
        }
    }
}
