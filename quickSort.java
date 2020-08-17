import java.util.Arrays;

public class quickSort {
    public static void sort(int[] arr){
        //左闭右闭区间
        sortInter(arr,0,arr.length-1);
    }
    private static void sortInter(int[] arr,int left,int right){
        if(left == right){
            return;
        }
        if(left > right){
            return;
        }
        int partIndext = partition(arr,left,right);
        sortInter(arr,left,partIndext-1);
        sortInter(arr,partIndext+1,right);
    }
    private static int partition(int[] arr,int left,int right){
        int part = arr[left];
        int i = left;
        int j = right;
        while(i < j){
            //包含等于，保证稳定性
            while(i<j && arr[j] >= part){
                j--;
            }
            while(i<j && arr[i] <= part){
                i++;
            }
            swap(arr,i,j);
        }
        swap(arr,left,i);
        return i;
    }
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,1,4,2,9,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
