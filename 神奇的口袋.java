

//有一个神奇的口袋，总的容积是40，
//John现在有n个想要得到的物品，每个物品的体积分别是a1，a2……an。John可以从这些物品中选择一些，选出的物体为40，
//有多少种不同的选择物品的方式。

   //将所有物品重量依次放在数组中，进行递归。
   //Count(s,n)s代表当前背包还可以装的重量,n代表目前所剩的物品个数
import java.util.Scanner;

public class Main{
    static int[] weight;
    //方案数为count
    static int count = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        weight = new int[n+1];
        for(int i = 1; i <= n;i++)
        {
            weight[i] = in.nextInt();
        }
        Count(40,n);
        System.out.println(count);
    }
    public static void Count(int s,int n){
        if(s == 0)
        {
            count++;
            return;
        }
        if(s < 0 || (s > 0 && n < 1))
        {
            return;
        }
       Count(s-weight[n],n-1);
        Count(s,n-1);
    }
}
