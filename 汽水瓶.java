import java.util.Scanner;

public class Main17 {
    public static int Count(int n)
    {
        //喝的汽水总数
        int count = 0;
        while(n > 2)
        {
            count = count+n/3;
            n = n/3+n%3;
        }
        if(n == 2)
        {
            count = count + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int n = in.nextInt();
            System.out.println(Count(n));
        }
    }
}
