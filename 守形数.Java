链接：https://www.nowcoder.com/questionTerminal/99e403f8342b4d0e82f1c1395ba62d7b
来源：牛客网

守形数是这样一种整数，它的平方的低位部分等于它本身。 比如25的平方是625，低位部分是25，因此25是一个守形数。 编一个程序，判断N是否为守形数。
输入描述:
输入包括1个整数N，2<=N<100。

输出描述:
可能有多组测试数据，对于每组数据，
输出"Yes!”表示N是守形数。
输出"No!”表示N不是守形数。
示例1
输入
25
4
输出
Yes!
No!


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            //平方后的数
            int m = n*n;
            String sn = String.valueOf(n);
            String sm = String.valueOf(m);
            int len = sn.length();
            String part_sm = sm.substring(sm.length()-len,sm.length());
            if(sn.equals(part_sm)){
                System.out.println("Yes!");
            }
            else{
                System.out.println("No!");
            }
        }
    }
}
