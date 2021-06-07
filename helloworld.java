import java.util.Scanner;
public class helloworld
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;        //定义一个String
        while (true){      //while循环 一直为正确
            str = sc.next();    //把键盘输入的值 给 str
            str = str.replace("吗","");   //将str中的值"吗"替换成"" 并返回给str
            str = str.replace("?","!");   //将str中的值"?"替换成"!" 并返回给str
            str = str.replace("？","!");  //将str中的值"？"替换成"!" 并返回给str
            System.out.println(str);    //输出str的值
        }
    }
}






