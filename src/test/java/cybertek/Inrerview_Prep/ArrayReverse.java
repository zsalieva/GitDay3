package cybertek.Inrerview_Prep;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[]arr2 ={12,34,56,78,99};
        reverse(arr2);
        System.out.println( reverse(arr2));

    }

    public static String reverse(int[]arr){
        int[] arr1= new int[arr.length];
        int count=0;
        for(int i= arr.length-1; i>=0; i--){

            arr1[count]=arr[i];
            count++;
        }
        return Arrays.toString(arr1);
    }

}
