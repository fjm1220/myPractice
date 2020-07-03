//读入一个字符串str，输出字符串str中的连续最长的数字串
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            int max = 0;
            char[] ch = str.toCharArray();
            int i = 0;
            int count = 0;
            int start = 0;
            int end = 0;
            while(i < ch.length){
                while(i < ch.length && ch[i] >= '0' && ch[i] <= '9'){
                    if(count == 0){
                        end = i;
                    }
                    count++;
                    end++;
                    i++;
                }
                i++;
                if(count > max){
                   max = count;
                   start = end - max;
                   count = 0;
                }
                else{
                    count = 0;
                }
            }
            String res = str.substring(start,start+max);
            System.out.println(res);
        }
    }
}
