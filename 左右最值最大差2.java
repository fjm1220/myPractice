//左右最值最大差
	//基于贪心算法思想
public class Main14
{
    public int findMaxGap(int[] A, int n)
    {
        //先找出数组中的最大值
        int max = 0;
        for(int i = 0;i < A.length;i++)
        {
            if(max < A[i])
            {
                max = A[i];
            }
        }
        int ret1 = max - A[0];
        int ret2 = max - A[n-1];
        if(ret1 > ret2)
        {
            return ret1;
        }
        else
            {
            return ret2;
        }
    }
}
