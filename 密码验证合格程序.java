链接：https://www.nowcoder.com/questionTerminal/184edec193864f0985ad2684fbc86841
来源：牛客网
密码要求:
1.长度超过8位
2.包括大小写字母.数字.其它符号,以上四种至少三种
3.不能有相同长度大于等于2的子串重复
输入描述:
一组或多组长度超过2的子符串。每组占一行
输出描述:
如果符合要求输出：OK，否则输出NG

示例1
输入
021Abc9000
021Abc9Abc1
021ABC9000
021$bc9000
输出
OK
NG
NG
OK


//牛客网通过90%
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            //1.判断长度是否超过8位
            if(str.length() > 8){
                char[] ch = str.toCharArray();
                int len = ch.length;
                int c1 = 0;
                int c2 = 0;
                int c3 = 0;
                int c4 = 0;
             for(int i = 0;i < len;i++){
                    if(ch[i] >= 'A' && ch[i] <= 'Z'){
                        c1 = 1;
                        continue;
                    }
                    else if(ch[i] >= 'a' && ch[i] <= 'z'){
                        c2 = 1;
                        continue;
                    }
                    else if(ch[i] >= '0' && ch[i] <= '9'){
                        c3 = 1;
                        continue;
                    }
                    else{
                        c4 = 1;
                        continue;
                    }
                }
                int sum = c1+c2+c3+c4;
                //2.3种或3种以上
                if(sum >= 3){
                    //3.判断是否有长度大于等于2的子串重复
                   for(int i=0 ;i<str.length()-2 ;i++){ 
                       //子串校验 
                       //a.从下标i开始，每次截取2个字符的字符串 
                       //b.从下标i+1开始截取剩余字符构成字符串，判断是否包含a中截取的字符串
                       //包含说明出现重复，不包含说明没有重复 
                       String substr1 =str.substring(i,i+3); 
                       if (str.substring(i+1).contains(substr1))
                          System.out.println("NG");
                   }
                      System.out.println("OK");
                }
                else{
                    System.out.println("NG");
                }
            }
            else{
                System.out.println("NG");
            }
        }
    }
}
