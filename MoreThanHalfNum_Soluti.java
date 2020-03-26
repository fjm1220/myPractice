import java.util.HashMap;
import java.util.Map;

public class Main46
{
    public static int MoreThanHalfNum_Solution(int [] array)
    {
        int mid = array.length/2;
        int ret = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < array.length;i++)
        {
            if(map.containsKey(array[i]))
            {
                int a = map.get(array[i])+1;
                map.put(array[i],a);
            }
            else{
                map.put(array[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > mid)
            {
                ret = entry.getKey();
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,2,2,2,2};
        System.out.println(MoreThanHalfNum_Solution(a));
    }
}
