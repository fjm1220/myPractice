链接：https://www.nowcoder.com/questionTerminal/a0c09a7e0da04e728810a8aca7226b7b
来源：牛客网

北京大学对本科生的成绩施行平均学分绩点制（GPA）。既将学生的实际考分根据不同的学科的不同学分按一定的公式进行计算。
公式如下： 实际成绩 绩点 90——100 4.0 85——89 3.7 82——84 3.3 78——81 3.0 75——77 2.7 72——74 2.3 68——71 2.0 64——67 1.5 60——63 1.0 60以下 0 
1．一门课程的学分绩点=该课绩点*该课学分
2．总评绩点=所有学科绩点之和/所有课程学分之和 现要求你编写程序求出某人A的总评绩点（GPA）。

输入描述:
第一行 总的课程数n（n<10）；
第二行 相应课程的学分（两个学分间用空格隔开）；
第三行 对应课程的实际得分；
此处输入的所有数字均为整数。

输出描述:
输出有一行，总评绩点，精确到小数点后2位小数。（printf("%.2f",GPA);）
示例1
输入
5
4 3 4 2 3
91 88 72 69 56
输出
2.52

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            //总课程数
            int n = in.nextInt();
            //每门课程的学分
            int[] schoolScore = new int[n];
            //每门课程的实际得分
            //t score = 0;
            //所有课程的学分之和
            int countScore = 0;
            //存放每门学科的学分绩点
             double[] port = new double[n];
            //
            double countPort = 0;
            for(int i = 0;i < n;i++){
                schoolScore[i] = in.nextInt();
                countScore+=schoolScore[i];
            }
            for(int i = 0;i < n;i++){
                int score = in.nextInt();
                if(score >= 90 && score <=100){
                    port[i] = 4.0 * schoolScore[i];
                }
               if(score >= 85 && score <= 89){
                    port[i] = 3.7 * schoolScore[i];
                }
                if(score >= 82 && score <= 84){
                    port[i] = 3.3 * schoolScore[i];
                }
                if(score >= 78 && score <= 81){
                    port[i] = 3.0 * schoolScore[i];
                }
                if(score >= 75 && score <=77){
                    port[i] = 2.7 * schoolScore[i];
                }
                if(score >= 72 && score <=74){
                    port[i] = 2.3 * schoolScore[i];
                }
                if(score >= 68 && score <=71){
                    port[i] = 2.0 * schoolScore[i];
                }
                if(score >= 64 && score <=67){
                    port[i] = 1.5 * schoolScore[i];
                }
                if(score >= 60 && score <=63){
                    port[i] = 1.0 * schoolScore[i];
                }
                if(score < 60){
                    port[i] = 0 * schoolScore[i];
                }
                   countPort+=port[i];
}
                   double GPA = countPort / countScore;
                   System.out.printf("%.2f",GPA);
                   System.out.println();
}
}
}
