
//给定一个长度为N(N>1)的整型数组A，
//可以将A划分成左右两个部分，左部分A[0..K]，右部分A[K+1..N-1]，
//K可以取值的范围是[0,N-2]。
//求这么多划分方案中，左部分中的最大值减去右部分最大值的绝对值，最大是多少

import java.util.*;

public class Main48 {
    public class MaxGap {
        public int findMaxGap(int[] A, int n)
        {
            int max = 0;
        for(int k = 0;k <= (n-2);k++)
        {
            int mL = 0;
            int mR = 0;
            for(int i = 0;i <= k;i++)
            {
                if(A[i] > mL)
                {
                    mL = A[i];
                }
            }
            for(int j = k+1;j <=n-1;j++)
            {
                if(A[j] > mR)
                {
                    mR = A[j];
                }
            }
            if((mR - mL) >= max)
            {
                max = mR - mL;
            }
            else if((mL - mR) > max)
            {
                max = mL -mR;
            }
        }
        return max;
        }
    }
}