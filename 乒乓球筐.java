//输入描述:
	//输入有多组数据。
	//每组数据包含两个字符串A、B，代表A盒与B盒中的乒乓球，
	//每个乒乓球用一个大写字母表示，即相同类型的乒乓球为相同的大写字母。
	//字符串长度不大于10000。

//输出描述:
	//每一组输入对应一行输出：如果B盒中所有球的类型在A中都有，
	//并且每种球的数量都不大于A，则输出“Yes”；否则输出“No

import java.util.Scanner;

public class Main13
{
    public static boolean A(String str1,String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if(str2.length() > str1.length())
        {
            return false;
        }
        else
        {   int i = 0;
            int j = 0;
            while(i < arr1.length && j < arr2.length)
            {
				//若相等，则都置为空字符，并且str1从头开始，Str2继续向前走
				//否则str1向前走
                if(arr1[i] == arr2[j])
                {
                    arr1[i] = ' ';
                    arr2[j] = ' ';
                    i = 0;
                    j++;
                }
                else{
                    i++;
                }
            }
            if(i >= str1.length() && j <str2.length())
            {
                return false;
            }
            else
            {
                return true;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String str1 = in.next();
            String str2 = in.next();
            if(A(str1,str2))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
