//链接：https://www.nowcoder.com/questionTerminal/ae759916631f4711a90c4d4d9657f4b0
//来源：牛客网

//对于给定的正整数 n，计算其十进制形式下所有位置数字之和，并计算其平方的各位数字之和。

//输入描述:
//每行输入数据包括一个正整数n(0<n<40000)

//输出描述:
//对于每个输入数据，计算其各位数字之和，以及其平方值的数字之和，输出在一行中，之间用一个空格分隔，但行末不要有空格。

import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    while(in.hasNext()){
        int n = in.nextInt();
        int m = n*n;
        System.out.print(add(n));
        System.out.println(" "+add(m));
    }
}
         public static int add(int n){
        int res = 0;
        while(n != 0){
            res=res+n%10;
            n=n/10;
        }
        return res;
    }
}

   
