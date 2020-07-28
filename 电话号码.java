链接：https://www.nowcoder.com/questionTerminal/ceb89f19187b4de3997d9cdef2d551e8
来源：牛客网
import java.util.*;
public class Main{
    public static void main(String[] args){
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number = "222333444555666777788899991234567890";
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for(int i = 0;i < n;i++){
                String str = in.next();
                str = str.replace("-","");
                String res = "";
                for(int j = 0;j < 7;j++){
                    res+=number.charAt(letter.indexOf(str.charAt(j)));
                }
                res = res.substring(0,3)+"-"+res.substring(3,7);
                if(!list.contains(res)){
                    list.add(res);
                }
            }
              Collections.sort(list);
                for(int k = 0;k <list.size();k++){
                    System.out.println(list.get(k));
                }
              System.out.println();
        }
    }
}
