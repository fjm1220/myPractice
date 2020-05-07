//每组输入数据共两行
  //第一行为字符串A
  //第二行为字符串B
  //字符串长度均小于100且只包含小写字母
//输出一个数字，表示把字符串B插入字符串A之后构成一个回文串的方法数

//思路：
//1.先判断回文
    //两个指针i，j一个从前往后遍历，一个从后往前遍历，只要出现不相等就不是回文，直接返回false
//2.统计
    //利用StringBuilder中的insert方法插入再判断并统计
import java.util.Scanner;

public class Main16 {
    public static boolean isHuiWen(String str)
    {
        int i = 0;
        int j = str.length()-1;
        char[] ch = str.toCharArray();
        while(i < j)
        {
            if(ch[i] != ch[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();
        int count = 0;
        for(int i = 0;i <= A.length();i++)
        {
            StringBuilder sb = new StringBuilder(A);
            sb = sb.insert(i,B);
            //用toString()转化
            if(isHuiWen(sb.toString()))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

