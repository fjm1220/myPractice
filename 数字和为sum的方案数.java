//链接：https://www.nowcoder.com/questionTerminal/7f24eb7266ce4b0792ce8721d6259800
//来源：牛客网

//给定一个有n个正整数的数组A和一个整数sum,求选择数组A中部分数字和为sum的方案数。
//当两种选取方案有一个数字的下标不一样,我们就认为是不同的组成方案。

//输入描述:
//输入为两行:
//第一行为两个正整数n(1 ≤ n ≤ 1000)，sum(1 ≤ sum ≤ 1000)
//第二行为n个正整数A[i](32位整数)，以空格隔开。
//输出描述:
//输出所求的方案数

//示例1
//输入
//5 15 
//5 5 10 2 3
//输出
//4

  //思路：看到这类题，就会想到用动态规划来解决，列出动态规划二维表格，就很容易解决啦
  //dp[i][j]代表前i个数中和为j的方案数

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            int sum = in.nextInt();
            int[] value = new int[n];
            //输入所有的数
            for(int k = 0;k < n;k++){
                value[k] = in.nextInt();
            }
            //注意：开始将二维数组设为int型，出现数据溢出，所以置为long类型
            long [][] dp = new long[n+1][sum+1];
            //初始化二维数组
            //第一列初始化为1，前i个数之和为0的方案始终只有一种
            //第一行的其他数默认初始化为0
            for(int i = 0;i < dp.length;i++){
                dp[i][0] = 1;
            }
            //遍历二维数组
            for(int i = 1;i < dp.length;i++){
                for(int j = 1;j < dp[i].length;j++){
                    if(value[i-1] == j){
                        dp[i][j] = dp[i-1][j]+1;
                    }
                    else if(value[i-1] < j){
                        //如果第i个数小于j，则总方案数=前i-1个数为j的方案数+前i-1个数中和为j-value[i-1]的方案数
                        dp[i][j] = dp[i-1][j]+dp[i-1][j-value[i-1]];
                    }
                    else if(value[i-1] > j){
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            System.out.println(dp[n][sum]);
        }
    }
}
