//输入一个整数，将这个整数以字符串的形式逆序输出
    //思路：不断地模10除10，将模10的结果不断地进行字符串拼接，
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = "";
        while(n != 0)
        {
                int temp = n%10;
                str = str+temp;
                n = n/10;
        }
        System.out.println(str);
    }
}
