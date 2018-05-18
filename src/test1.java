import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test1 {
    public static void main(String[] args) throws IOException {
        File fileFrom = new File("F:\\copy\\befor\\IMG23301.jpg");
//        System.out.println(fileFrom.getAbsolutePath());
        FileOutputStream fileInputStream=new FileOutputStream(fileFrom);
    }
}
