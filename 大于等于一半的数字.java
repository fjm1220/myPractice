/import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        String[] strs = str.split(" ");
//        int[] arr = new int[strs.length];
//        for(int i = 0;i < arr.length;i++)
//        {
//            arr[i] = Integer.valueOf(strs[i]);
//        }
//        int num = arr[0];
//        int count = 0;
//        for(int j = 1;j <arr.length;j++)
//        {
//            if(arr[j] == num)
//            {
//                count++;
//            }
//
//            else if(count > 0)
//            {
//                count--;
//            }
//            else{
//                num = arr[j];
//            }
//        }
//        System.out.println(num);
//    }
//}

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strs = str.split(" ");
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < strs.length;i++)
        {
            list.add(Integer.valueOf(strs[i]));
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()/2-1));
    }
}
