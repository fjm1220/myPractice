import java.util.Arrays;

public class bubbleSort {
    public static void sort(int[] arr){
        for(int i = 0;i < arr.length-1;i++){
            for(int j = 0;j < arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    //相邻两数间交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,1,4,2,9,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

时间复杂度：最好：数组有序O(n)
           最坏:数组逆序O(n^2)
           
