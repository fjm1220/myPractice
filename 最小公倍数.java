
//求输入A和B的最小公倍数。
    //a*b = （a与b的最小公倍数）*（a与b的最大公约数）
import java.util.*;
public class Main{
    public static int min_gbs(int a,int b)
    {
        return (a*b/max_gys(a,b));
    }
    public static int max_gys(int m,int n)
    {
        if(n == 0)
        {
            return m;
        }
        return max_gys(n,m%n);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt())
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int res = min_gbs(a,b);
            System.out.println(res);
        }
    }
}
