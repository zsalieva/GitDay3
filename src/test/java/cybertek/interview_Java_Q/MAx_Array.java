package cybertek.interview_Java_Q;

import java.util.Arrays;

public class MAx_Array {

    public static int  max_arr(int[] num){
        int max= Integer.MIN_VALUE;

        for(int each: num)
            if (each > max)
                max = each;
                return max;

    }


    public static void main(String[] args) {

       int[] test = new int[]{12,3, 5, 6, 7};

        System.out.println(max_arr(test));
    }
    //----------------------------------SECOND WAY-------------------------------------
    public static int arr_max(int []r){
        Arrays.sort(r);
        return r[r.length-1];

    }
}
