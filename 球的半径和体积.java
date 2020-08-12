链接：https://www.nowcoder.com/questionTerminal/4b733a850c364c32b368555c8c2ec96b
来源：牛客网

输入球的中心点和球上某一点的坐标，计算球的半径和体积

输入描述:
球的中心点和球上某一点的坐标，以如下形式输入：x0 y0 z0 x1 y1 z1


输出描述:
输入可能有多组，对于每组输入，输出球的半径和体积，并且结果保留三位小数

为避免精度问题，PI值请使用arccos(-1)。
示例1
输入
0 0 0 1 1 1 
输出
1.732 21.766


import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            double x0 = in.nextFloat();
            double y0 = in.nextFloat();
            double z0 = in.nextFloat();
            double x1 = in.nextFloat();
            double y1 = in.nextFloat();
            double z1 = in.nextFloat();
            double PI = Math.acos(-1);
            //Math.pow()方法是求一个数的多少次方，第一个参数是底数，第二个参数代表多少次方
            double a = Math.pow(x1-x0,2);
            double b = Math.pow(y1-y0,2);
            double c = Math.pow(z1-z0,2);
            double r = Math.sqrt(a+b+c);
            double v = (4.0/3)*PI*Math.pow(r,3);
            System.out.format("%.3f %.3f\n",r,v);
        }
    }
}
