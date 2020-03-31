import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            Map<String, Integer> map = new LinkedHashMap<>();
            int candidate = in.nextInt();   //候选人数
            //候选人姓名设置
            for (int i = 0; i < candidate; i++) {
                map.put(in.next(), 0);
            }
            int voter = in.nextInt();  //投票的人数
            int InvalidSum = 0;//无效票数
            //投票
            for (int i = 0; i < voter; i++) {
                String vote = in.next();  //投给谁
                if (map.containsKey(vote)) {
                    map.put(vote, map.get(vote) + 1);
                } else {
                    InvalidSum++;
                }
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("Invalid : " + InvalidSum);
        }
    }
}