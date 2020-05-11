import java.util.Scanner;
public class Main17{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //记录当前数字串的最大长度
        int max = 0;
        int i= 0;
        char[] arr = str.toCharArray();
        int len = arr.length;
        int begin = 0;
        int end = 0;
        while(i < len)
        {
            int count = 0;
            //注意还需判断i < len
            while(i < len && (arr[i] >= '0' && arr[i]<= '9'))
            {
                count++;
                i++;
            }
            if(count > max)
            {
                max = count;
                begin = i-count;
                end = i;
            }
            i++;
        }
        System.out.println(str.substring(begin,end));
    }
}
