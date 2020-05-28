//链接：https://www.nowcoder.com/questionTerminal/8af708723b0f45f9a80bc80d78d3566e
//来源：牛客网
   import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String c = in.next();
        int row = 0;
        if(N%2 == 0)
        {
           row = N/2;
        }
        else
        {
            row = (N/2+1);
        }
        for(int i = 0; i < row;i++)
        {
            //处理第一行和最后一行
            if(i == 0 || i == row-1)
            {
                for(int j = 0; j < N;j++)
                {
                    System.out.print(c);
                }
                System.out.println();
            }
            else
            {
                //处理中间行
                for(int j = 0;j < N;j++)
                {
                    if(j == 0 || j == N-1)
                    {
                        System.out.print(c);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                 System.out.println();
            }
        }
    }
}
    
