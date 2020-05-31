//验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。

//例如：

//1^3=1 
//2^3=3+5 
//3^3=7+9+11 
//4^3=13+15+17+19 

//输入：输入一个整数m
//输出：输出分解后的string
    //思路：只要找出输入的整数m与第一项的关系即可，后面都是前面一个加2，
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
        int m = in.nextInt();
        int a = m*(m-1)+1;
        System.out.print(a);
        for(int i = 1; i < m;i++)
        {
            a = a+2;
            System.out.print("+"+a);
        }
        //一定不要忘了这个换行
            System.out.println();
       }
    }
}
