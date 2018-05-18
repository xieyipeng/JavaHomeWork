package test7;

import java.io.*;

public class CopyPicture {
    public static void main(String[] args) {
        try {
            File fileFrom = new File("F:\\copy\\befor\\IMG201704021023301.jpg");
            File fileTo = new File("F:\\copy\\after\\copy_after.jpg");//不创建文件
            FileInputStream fileInputStream = new FileInputStream(fileFrom);
            FileOutputStream fileOutputStream = new FileOutputStream(fileTo);//创建输出流时创建文件

            byte[] bytes = new byte[(int) fileFrom.length()];
            fileInputStream.read(bytes);
            fileOutputStream.write(bytes);
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
