import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = in.nextInt();
        int[] v = new int[n];  //记录n个数字
        //dp[i][j]表示前i个数中和为j的方案数
        long[][] dp = new long[n+1][sum+1]; //动态规划数组
        for(int i = 0;i < n;i++)
        {
            v[i] = in.nextInt();
        }
        //初始化动态规划数组,第一列为1
        for(int i = 0;i < dp.length;i++)
        {
            dp[i][0] = 1;
        }
        for(int i = 1;i < dp.length;i++)
        {
            for(int j = 1;j < dp[i].length;j++)
            {   //如果新增的数字等于j(相当于背包容量)，则前i个数中和为j的方案数为前i-1个数中和为j的方案数加1
                if(v[i-1] == j)
                {
                    dp[i][j] = dp[i-1][j]+1;
                }
                else if(v[i-1] > j)
                {
                    //前i个数中和为j的方案数为前i-1个数中和为j的方案数
                    dp[i][j] = dp[i-1][j];
                }
                else if(v[i-1] < j)
                {
                    //前i个数中和为j的方案数为前i-1个数中和为j的方案数加上和为j-v[i]的方案数
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-v[i-1]];
                }
            }
        }
        System.out.println(dp[n][sum]);
    }
}
