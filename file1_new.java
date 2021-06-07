import java.io.*;

public class file1_new {
    public static void main(String[] args)throws IOException {
        File file = new File("/home/syh/test/test.txt" );
        if (!file.exists()) {
            file.createNewFile();
        } else {
            System.out.println("已存在");
        }
    }
}
