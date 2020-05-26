//三次异或实现无缓存交换
//例如：交换a和b
//a = a^b
//b = a^b=a^b^b=a^0=a
//a = a^b = a^b^a=0^b=b
//实现交换

import java.util.*;

public class Exchange
{
    public int[] exchangeAB(int[] AB)
    {
        AB[0] = AB[0]^AB[1];
        AB[1] = AB[0]^AB[1];
        AB[0] = AB[0]^AB[1];
        return AB;
    }
}
