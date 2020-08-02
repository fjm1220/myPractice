链接：https://www.nowcoder.com/questionTerminal/610e6c0387a0401fb96675f58cda8559

//主要推导出无人获奖的公式即可
//再注意输出格式
import java.util.*;
public class Main{
    public static float noWard(int n){
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return (n-1)*(noWard(n-1)+noWard(n-2));
    }
    public static float count(int n){
        if(n == 1){
            return 1;
        }
        return n*count(n-1);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            float res = (noWard(n)/count(n))*100;
            System.out.println(String.format("%.2f",res)+"%");
        }
    }
}
