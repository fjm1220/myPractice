链接：https://www.nowcoder.com/questionTerminal/9fe25b6cf93e46dcb09ba67aeef2c4cc
来源：牛客网

题目：一个百万富翁遇到一个陌生人，陌生人找他谈了一个换钱的计划。该计划如下：我每天给你10 万元，你第一天给我1 分钱，第二天2 分钱，
第三天4 分钱……
这样交换 30 天后，百万富翁交出了多少钱？陌生人交出了多少钱？（注意一个是万元，一个是分）

方法一：普通方法，累加；时间复杂度为O(n);
public class Main{
   public static int Strange(int n){
        int count = 0;
        for(int i = 0;i < n;i++){
             count+=Math.pow(2,i);
        }
            return count;
        }
    public static void main(String[] args){
        int richMan = 30*10;
        long strange = Strange(30);
        System.out.println(richMan+" "+strange);
    }
}

方法二：将1左移30位，得到的其实是第31天陌生人要给的钱数，然后再减1，二进制数的前30位都为1，就可以得到前30天的钱数，
public class Main{
    public static void main(String[] args){
        int richMan = 10*30;
        long strange = (1L<<30)-1;
        System.out.println(richMan+" "+strange);
    }
}
