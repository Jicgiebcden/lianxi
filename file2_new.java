import java.io.*;

public class file2_new {


        public static void main(String args[]) {
            try {
                File file = new File("/home/syh/test/test.txt");
                BufferedWriter out = new BufferedWriter(new FileWriter(file));
                out.write("我写入了\n\n我啊啊啊");
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}