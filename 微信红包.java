//给定一个红包的金额数组gifts及它的大小n，请返回次数超过一半的红包金额。
//若没有金额超过总数的一半，返回0。

    //思路：要找超过一半的数，对数组进行排序后，如果存在超过一半的数，则经过排序后中间的那个数的肯定就是所求的数
    //所以排序找到中间的数后，比那里数组进行判断，这个数的次数是否超过数组的一半
import java.util.*;

public class Gift {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int num = gifts[n/2];
        int count = 0;
        for(int i = 0;i < gifts.length;i++)
        {
            if(gifts[i] == num)
            {
                count++;
            }
        }
        if(count > n/2)
        {
            return num;
        }
        return 0;
    }
}
