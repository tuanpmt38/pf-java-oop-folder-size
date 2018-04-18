import java.io.File;
import java.util.Scanner;

public class FileSize {
    public static long getFile(File file) {
        long size = 0;
        File[] list = file.listFiles();
        if (list == null || list.length == 0) {
            return size;
        }
        for (File f : list) {
            if (f.isFile())
                size += f.length();
            else
                size += getFile(f);
        }
        return size;
    }

    public static void main(String[] args) {
        File folder = new File("D:\\codegym\\Exercise-java\\oop\\pf-java-oop-get-size-folder\\src");
        long size = getFile(folder);
        System.out.println("folder in size: " + size);
    }
}
