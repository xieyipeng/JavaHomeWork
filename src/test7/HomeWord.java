package test7;

import java.io.File;

public class HomeWord {
    private static void addFile(File filePath) {
        if (filePath.isDirectory()) {
            String[] files = filePath.list();
            assert files != null;
            for (String file : files) {
                File newFile = new File(filePath + "\\"+file);
                addFile(newFile);
            }
        } else if (filePath.getName().endsWith(".txt")) {
            System.out.println(filePath.getName());
        }
    }

    public static void main(String[] args) {
        File file = new File("E:\\android");
        addFile(file);
    }
}
