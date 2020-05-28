// String addend：加数
// String augend：被加数
import java.util.Scanner;
import java.math.BigInteger;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
        String s1 = in.next();
        String s2 = in.next();
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        System.out.println(num1.add(num2));
        }
    }
}
