//输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
      //一个偶数和一个5相乘就会得到一个0，所以我们要进行数字分解，统计有多少个5
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n < 5)
        {
            System.out.println(0);
        }
        else
        {
            int count = 0;
            for(int i = n; i >= 5;i--)
            {
                int temp = i;
                while(temp%5 == 0)
                {
                    count++;
                    temp = temp/5;
                }
            }
            System.out.println(count);
        }
    }
}
