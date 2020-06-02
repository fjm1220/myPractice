import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int N = in.nextInt();
            int[] num = new int[N];
            for(int i = 0; i < N;i++)
            {
                num[i] = in.nextInt(); 
            }
            int score = in.nextInt();
            int count = 0;
            for(int i = 0;i < N;i++)
            {
                if(num[i] == score)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
