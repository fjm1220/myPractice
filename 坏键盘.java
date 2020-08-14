输入
7_This_is_a_test<br/>_hs_s_a_es
输出
7TI

思路：将两个字符串都转换为大写，然后遍历第一个字符串

import java.util.*;
public class Main{
    public static void main(String[] arga){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        String res = "";
        for(int i = 0;i < s1.length();i++){
            String s = s1.charAt(i)+"";
            if((!s2.contains(s))&&(!res.contains(s))){
                res+=s;
            }
        }
        System.out.println(res);
    }
}
