
//给定一个int数组A和它的大小n，请返回A中的逆序对个数。保证n小于等于5000。
//有一组数，对于其中任意两个数组，若前面一个大于后面一个数字，则这两个数字组成一个逆序对。
//请设计一个高效的算法，计算给定数组中的逆序对个数。
    //思路一：暴力解法，扫描整个数组，每扫描到一个树，就逐个比较该数与后面数组的大小，并判断。
        //显然不高效，时间复杂度为O(n^2)
    //思路二：分治思想，利用归并排序的思路处理，在两个有序数组进行merge的同时统计逆序对数
        //时间复杂度为O(n*log(n))
import java.util.*;

public class AntiOrder {
    public int count(int[] A, int n) {
        if((A == null) || (n==0))
        {
            return 0;
        }
        return mergeSortInternal(A,0,n-1);
    }
    public static int mergeSortInternal(int[] arr,int low,int high)
    {
        int mid=(low+high)/2;
        if(low == high)
        {
            return 0;
        }
        //逆序对的总数=左边数组中的逆序对的数量+右边数组中逆序对的数量+左右合成新的顺序数组时出现放入逆序对的数量
        return mergeSortInternal(arr,low,mid)
            +mergeSortInternal(arr,mid+1,high)
            +merge(arr,low,mid,high);
    }
    public static int merge(int[] arr,int low,int mid,int high)
    {
        int i = low;
        int j = mid+1;
        int length = (high-low+1);
        int[] temp = new int[length];
        int k = 0;
        int sum = 0;
        while(i <= mid && j <= high)
        {
            //包含等于，保证稳定性
            if(arr[i] <= arr[j])
            {
                temp[k++] = arr[i++];
            }
            else{
                //归并排序中的merge原理为两个顺序数组的合并
                //所以当arr[i] > arr[j]时，arr[i]到arr[mid]都大于arr[j]
                //所有逆序数组对增加mid-i+1个
                sum+=(mid-i+1);
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid)
        {
            temp[k++] = arr[i++];
        }
        while(j <= high)
        {
            temp[k++] = arr[j++];
        }
        for(int t = 0;t < temp.length;t++)
        {
            arr[low++] = temp[t];
        }
        return sum;
    }
}
