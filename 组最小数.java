
//给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。目标是使得最后得到的数尽可能小（注意0不能做首位）。例如：

//给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int[] num = new int[10];
            for(int i = 0;i < 10;i++)
            {
                num[i] = in.nextInt();
            }

            String str1 = "";
            //先不管0，将其他数字从小到大依次拼到字符串上
            for (int i = 1; i < num.length; i++) {
                if (num[i] != 0) {
                    for (int j = 0; j < num[i] ; j++) {
                        str1 += String.valueOf(i);
                    }
                }
            }
            StringBuilder res = new StringBuilder(str1);
            //如果有0就将0插入到从第二位开始的位置上
            if (num[0] != 0) {
                for (int i = 0; i < num[0]; i++) {
                    res.insert(1, "0");
                }
            }
            System.out.println(res);
        }
    }
}
