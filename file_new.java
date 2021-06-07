import java.io.*;

public class file_new {
    public static void main(String[] args) {
        File file = new File("/home/syh/test");
        if (!file.exists()) {
            file.mkdir();
        } else {
            System.out.println("已存在");
        }
    }
}
