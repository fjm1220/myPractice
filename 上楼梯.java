链接：https://www.nowcoder.com/questionTerminal/7f0661ace6df48d0af3f924950d57126
来源：牛客网

有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。请实现一个方法，计算小孩有多少种上楼的方式。为了防止溢出，请将结果Mod 1000000007

给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。

测试样例1：
1
返回：1
测试样例2：
3
返回：4
测试样例3：
4
返回：7


思路：利用动态规划

import java.util.*;

public class GoUpstairs {
    public int countWays(int n) {
        // write code here
        long[] num = {1,2,4};
        if(n <= 0){
            return 0;
        }
        else if(n <= 3){
            return (int)num[n-1];
        }
        else{
            for(int i = 4;i <= n;i++){
                long temp = (num[0]+num[1]+num[2])%1000000007;
                num[0] = num[1];
                num[1] = num[2];
                num[2] = temp;
            }
            return (int)num[2];
        }
    }
}
