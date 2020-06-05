//一个百万富翁遇到一个陌生人，陌生人找他谈了一个换钱的计划。该计划如下：我每天给你10 万元，你第一天给我1 分钱，第二天2 分钱，第三天4 分钱……
//这样交换 30 天后，百万富翁交出了多少钱？陌生人交出了多少钱？（注意一个是万元，一个是分）

//方法一：递归
public class Main{
    public static int Stranger_momey(int day)
    {
        if(day == 1)
        {
            return 1;
        }
        return 2*Stranger_momey(day-1);
    }
    public static void main(String[] args)
    {
        int stranger = 0;
        for(int i = 0;i < 30;i++)
        {
            stranger = stranger+Stranger_momey(30-i);
        }
        System.out.println(10*30 +" "+stranger);
    }
}
//方法二：
import java.lang.Math;
public class Main{
    public static void main(String[] args)
    {
        long stranger = 0;
        for(int i = 0;i < 30;i++)
        {
            stranger = stranger+(long)Math.pow(2,i);
        }
        System.out.println(10*30 +" "+stranger);
    }
}
