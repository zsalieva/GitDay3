package cybertek.interview_Java_Q;

import java.util.Arrays;

public class Min_Array {
    public static int min_arr(int[] n) {
        int min = Integer.MAX_VALUE;

        for (int each : n)
            if (each<min)
                min=each;

     return min;

    }

    public static void main(String[] args) {

        int[] num =new int[]{3,6,7,9,2};

        min_arr(num);
        System.out.println(min_arr(num));
        System.out.println(arr_min(num));
    }

     //---------------------------------SECOND VR-----------------------------------
 public static int arr_min(int[] n){

     Arrays.sort(n);
     return n[0];
 }
}