//广播台：K1     覆盖地区："北京","上海","天津"
//		  k2			   "广州","北京","深圳"
//		  k3			   "成都","上海","杭州"
//		  k4			   "上海","天津"
//		  k5			   "杭州","大连"

//如何选择最少的广播台，让所有地区都可以接收到信号
	//贪心算法
	
import java.util.*;

public class Main15
{
    public static void main(String[] args)
    {
        HashMap<String,HashSet<String>> map = new HashMap<>();

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("北京");
        hashSet1.add("上海");
        hashSet1.add("天津");

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("广州");
        hashSet2.add("北京");
        hashSet2.add("深圳");

        HashSet<String> hashSet3 = new HashSet<>();
        hashSet3.add("成都");
        hashSet3.add("上海");
        hashSet3.add("杭州");

        HashSet<String> hashSet4 = new HashSet<>();
        hashSet4.add("上海");
        hashSet4.add("天津");

        HashSet<String> hashSet5 = new HashSet<>();
        hashSet5.add("杭州");
        hashSet5.add("大连");

        map.put("k1",hashSet1);
        map.put("k2",hashSet2);
        map.put("k3",hashSet3);
        map.put("k4",hashSet4);
        map.put("k5",hashSet5);

        HashSet<String> allAreas = new HashSet<>();
        allAreas.add("北京");
        allAreas.add("上海");
        allAreas.add("天津");
        allAreas.add("广州");
        allAreas.add("深圳");
        allAreas.add("成都");
        allAreas.add("杭州");
        allAreas.add("大连");

        ArrayList<String> ret = new ArrayList<>();
        HashSet<String> tmp = new HashSet<>();
        //maxKey 用来记录当前最大覆盖面的key
        String maxKey = null;
        //max用来记录当前最大覆盖的个数
        int max = 0;
        while(allAreas.size() != 0)
        {
            //一次for循环结束后将maxKey和max清空
            maxKey = null;
            max = 0;
            for(String key : map.keySet())
            {
                //注意要将tmp清空
                tmp.clear();
                HashSet<String> areas = map.get(key);
                tmp.addAll(areas);
                //求tmp和allAreas的交集，且最终的交集为tmp
                tmp.retainAll(allAreas);
                if(tmp.size() > 0 && (maxKey == null || tmp.size() > max))
                {
                    maxKey = key;
                    max = tmp.size();
                }
            }
                if(maxKey != null)
                {
                    ret.add(maxKey);
                    allAreas.removeAll(map.get(maxKey));
                }
        }
        System.out.println("结果为：" + ret);
    }
}
		  