//给定一个k位整数N，编写程序统计每种不同的个位数字出现的次数。例如：给定N = 100311，则有2个0，3个1，和1个3。
//输入的数不超过1000位的正整数N。
    //思路：遍历每一位数，统计0-9的个数，利用list来保存统计的个数
    //输入的数不超过1000所以就不能直接nextInt()来输入一个整数。而是直接输入字符串型的
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] ch = str.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < 10;i++)
        {
            list.add(0);
        }
        for(int i = 0; i < ch.length;i++)
        {
            list.set(ch[i]-'0',list.get(ch[i]-'0')+1);
        }
        for(int i = 0; i < list.size();i++)
        {
            if(list.get(i) > 0)
            {
                 System.out.println(i+":"+list.get(i));
            }
        }
    }
}
