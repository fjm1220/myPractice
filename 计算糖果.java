//已知A - B, B - C, A + B, B + C四个整数，求出满足的A,B,C,若无满足的输出N
 //法一
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a,b,c,d;
        int A,B,C;
        while(in.hasNextInt())
        {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            A = (a+c)/2;
            B = (b+d)/2;
            C = d-B;
           if(((A-B)==a) &&((B-C)==b)&&((A+B)== c) &&((B+C)==d))
           {
                System.out.println(A+" "+B+" "+C);
           }
            else{
                System.out.println("No");
            }
        }
    }
}

  //法二：
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a,b,c,d;
        int A,B,C;
        while(in.hasNextInt())
        {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();
            A = (a+c)/2;
            B = (b+d)/2;
            C = d-B;
            if(((a+c)/2-A) != 0)
            {
                System.out.println("No");
                return;
            }
            if(((c-a)/2-B) != 0 || ((b+d)/2-B) != 0)
            {
                System.out.println("No");
                return;
            }
            if(((d-b)/2-C) != 0)
            {
                System.out.println("No");
                return;
            }
            else{
                System.out.println(A+" "+B+" "+C);
            }
        }
    }
}
