import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            int grops = in.nextInt();
            int num = grops;
            while(grops > 0)
            {
                int n = in.nextInt();
                int k = in.nextInt();
                int[] res = new int[2*n];
                Stack<Integer> stack = new Stack<>();
                //初始化数据
                for(int i = 0;i < 2*n;i++)
                {
                    res[i] = in.nextInt();
                }
                //循环k次洗牌
                for(int i = 0;i < k;i++)
                {
                    for(int j = 0;j < n;j++)
                    {
                        stack.add(res[2*n-1-j]);
                        stack.add(res[n-1-j]);
                    }
                    for(int m = 0;m < 2*n;m++)
                    {
                        int temp = stack.pop();
                        res[m] = temp;
                    }
                }
                //得到一组数洗牌k次后的数据
                if(grops == 1)
                {
                    for(int i = 0; i < 2*n-1;i++)
                    {
                        System.out.print(res[i] + " ");
                    }
                    System.out.println(res[2*n-1]);
                }
                else
                {
                    for(int i = 0; i < 2*n;i++)
                    {
                        System.out.print(res[i] + " ");
                    }
                }
                grops--;
            }
            System.out.println();
        }
    }
}
