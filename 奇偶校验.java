链接：https://www.nowcoder.com/questionTerminal/729d11d043d8448e83befa1410b694fe
来源：牛客网

输入一个字符串，然后对每个字符进行奇校验，最后输出校验后的二进制数(如'3’，输出：10110011)。

输入描述:
输入包括一个字符串，字符串长度不超过100。

输出描述:
可能有多组测试数据，对于每组数据，
对于字符串中的每一个字符，输出按题目进行奇偶校验后的数，每个字符校验的结果占一行。

示例1：
输入
3
3a
输出
10110011
10110011
01100001

思路：计算机中的所有信息都是以ASCII码形式存储在机器内部的，3的ASCII码为51,51的二进制表示形式为0110011，
      取最高位为奇校验位，当1的个数为奇数个时，最高位为0；当1的个数为偶数时，最高位为1；所以3校验后的二进制为10110011。
      将字符转换为7位二进制形式：做7次按位与运算即可，开始让字符和1按位与，然后将1做左移1位运算。
      
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String str = in.nextLine();
            char[] ch = str.toCharArray();
            for(int i = 0;i < ch.length;i++){
                int flag = 1;
                int[] result = new int[8];
                int j = 7;
                int sum = 0;
                //进行7次按位比较
                while(j > 0){
                    result[j] = (ch[i] & flag) == 0 ? 0:1;
                    if(result[j] == 1){
                        sum++;
                    }    
                    j--;
                    flag = flag<<1;
                }
                if(sum%2 == 0){
                    //偶数个1；
                    result[0] = 1;
                }
                else{
                    //奇数个1；
                    result[0] = 0;
                }
                for(int k = 0;k < result.length;k++){
                    System.out.print(result[k]);
                }
                System.out.println();
            }
        }
    }
}
      

