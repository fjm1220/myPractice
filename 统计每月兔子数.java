//有一只兔子，从出生后第3个月起每个月都生一只兔子，
//小兔子长到第三个月后每个月又生一只兔子，假如兔子都不死，问每个月的兔子总数为多少？
import java.util.*;
public class Main{
    public static int Count(int month)
    {
        if(month == 1 || month == 2)
        {
            return 1;
        }
        return Count(month-1)+Count(month-2);
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
             int n = in.nextInt();
             int res = Count(n);
             System.out.println(res);
        }
       
    }
}
 
