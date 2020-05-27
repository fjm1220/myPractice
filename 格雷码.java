
//在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 则称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。

//给定一个整数n，请返回n位的格雷码，顺序为从0开始。
    //思路：n=1生成的格雷码为："0","1"
     //    n=2生成的格雷码为："00","01","11","10"
     //二进制的位数每多一位，就是在前面的基础上在最高位添加0或者1，找规律发现添加1的一半进行逆序即可

public class GrayCode {
    public String[] getGray(int n) {
        String[] res = null;
        if(n == 1)
        {
             res = new String[]{"0","1"};
             return res;
        }
        else
        {
            String[] str = getGray(n-1);
             res = new String[2*str.length];
             for(int i = 0; i < str.length;i++)
             {
                 res[i] = "0"+str[i];
                 res[2*str.length-1-i] = "1"+str[i];
             }
              return res;
        }
    }
}
