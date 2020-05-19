import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int n = in.nextInt();
            if(n >= 1000)
            {
                n = 999;
            }
            List<Integer> list = new ArrayList<>();
            for(int i =0;i < n;i++)
            {
                list.add(i);
            }
            int j = 0;
            while(list.size() > 1)
            {
                j=(j+2)%list.size();
                list.remove(j);
            }
            System.out.println(list.get(0));
        }
    }
}
