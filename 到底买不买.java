//链接：https://www.nowcoder.com/questionTerminal/2f13c507654b4f878b703cfbb5cdf3a5
//来源：牛客网

//小红想买些珠子做一串自己喜欢的珠串。卖珠子的摊主有很多串五颜六色的珠串，但是不肯把任何一串拆散了卖。于是小红要你帮忙判断一
//下，某串珠子里是否包含了全部自己想要的珠子？如果是，那么告诉她有多少多余的珠子；如果不是，那么告诉她缺了多少珠子。
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Main{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //输入商人手中的珠子
        String s1 = in.nextLine();
        //输入小红手中的珠子
        String s2 = in.nextLine();
        Map<Character,Integer> map1 = new HashMap<>();
        for(char c : s1.toCharArray())
        {
            if(map1.containsKey(c))
            {
                map1.put(c,map1.get(c)+1);
            }
            else{
                map1.put(c,1);
            }
        }
        Map<Character,Integer> map2 = new HashMap<>();
        for(char c : s2.toCharArray())
        {
            if(map2.containsKey(c))
            {
                map2.put(c,map2.get(c)+1);
            }
            else{
                map2.put(c,1);
            }
        }
        boolean flag = true;
        int lack = 0;
        for(Map.Entry<Character,Integer> entry:map2.entrySet())
        {
            char key = entry.getKey();
            int value = entry.getValue();
            if(map1.containsKey(key) && map1.get(key) < value)
            {
                flag = false;
                lack += value - map1.get(key);
            }
            else if(!map1.containsKey(key))
            {
                flag = false;
                lack +=value;
            }
        }
        if(flag)
        {
            int num = s1.length()-s2.length();
            System.out.println("Yes "+num);
        }
        else{
            System.out.println("No "+lack);
        }
}
}
