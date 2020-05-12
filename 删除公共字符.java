//输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
//例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”

import java.util.Scanner;

public class Main17{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        char[] ch = str1.toCharArray();
        for(int i = 0;i < ch.length;i++)
        {
            if(!str2.contains(String.valueOf(ch[i])))
            {
                System.out.print(ch[i]);
            }
        }
    }
}
