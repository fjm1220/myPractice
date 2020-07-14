//链接：https://www.nowcoder.com/questionTerminal/3350d379a5d44054b219de7af6708894
//来源：牛客网

//输入描述:
//输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。

//输出描述:
//每行输出候选人的名字和得票数量。

//示例1
//输入
//4
//A B C D
//8
//A B C D E F G H
//输出
//A : 1
//B : 1
//C : 1
//D : 1
//Invalid : 4
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int num_h = in.nextInt();
            //用该种方法一定要用LinkedHashMap,否则会出现顺序错误导致不通过
            Map<String,Integer> map = new LinkedHashMap<>();
            for(int i = 0;i < num_h;i++){
                String people_h = in.next();
                map.put(people_h,0);
            }
            map.put("Invalid",0);
            int num_t = in.nextInt();
            for(int j = 0;j < num_t;j++){
                String people = in.next();
                if(map.containsKey(people)){
                    map.put(people,map.get(people)+1);
                }
                else{
                    map.put("Invalid",map.get("Invalid")+1);
                }
            }
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                System.out.println(entry.getKey()+" : "+ entry.getValue());
            }
        }
    }
}
