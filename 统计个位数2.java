//放在数组里遍历
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       String str = in.nextLine();
            char[] arr = str.toCharArray();
            int[] num = new int[arr.length];
            for(int i = 0;i < arr.length;i++)
            {
                num[i] = arr[i]-'0';
            }
            Arrays.sort(num);
            int count = 1;
            for(int i = 1;i < arr.length;i++)
            {
                if(num[i] == num[i-1])
                {
                    count++;
                }
                else
                {
                    System.out.println(num[i-1]+":"+count);
                    count = 1;
                }
            }
            System.out.println(num[num.length-1]+":"+count);
        }
    }
