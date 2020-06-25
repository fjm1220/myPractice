链接：https://www.nowcoder.com/questionTerminal/3897c2bcc87943ed98d8e0b9e18c4666
来源：牛客网

输入包括多组测试数据。
每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
学生ID编号从1编到N。
第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。


输出描述:
对于每一次询问操作，在一行里面输出最高成绩.
示例1
输入
5 7
1 2 3 4 5
Q 1 5
U 3 6
Q 3 4
Q 4 5
U 4 5
U 2 9
Q 1 5
输出
5
6
5
9

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int s = in.nextInt();
            int n = in.nextInt();
            int[] score = new int[s];
            //学生成绩
            for(int i = 0;i < s;i++){
                score[i] = in.nextInt();
            }
            //操作
            for(int j = 0;j < n;j++){
                String c = in.next();
                int a = in.nextInt();
                int b = in.nextInt();
                //询问查找最大
                if(c.equals("Q")){
                //学生编号从1开始，但数组下标从0开始
                int start = Math.min(a,b);
                int end = Math.max(a,b);
                    int max = score[a-1];
                    for(int k = start-1;k < end;k++){
                        max = Math.max(max,score[k]);
                    }
                    System.out.println(max);
                }
                else{
                    score[a-1] = b;
                }
            }
        }
    }
}
