//想让一个数变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
      //思路：确定当前数n在哪两个Fibonacci数之间。

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f1 = 0;
        int f2 = 1;
        while(n>f2)
        {
            int temp = f2;
            f2 = f1+f2;
            f1 = temp;
        }
        int a = n-f1;
        int b = f2-n;
        System.out.println(a < b?a:b);
    }
}
