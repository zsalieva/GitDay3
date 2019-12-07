package cybertek.Inrerview_Prep;

import java.util.Arrays;

public class ArrayMax_Min {
    public static void main(String[] args) {

        int[] array1= {23,4,55,67,7,9};

        MaxValue(array1);
        System.out.println(MaxValue(array1));

        MaxValue2(array1);
        System.out.println(MaxValue2(array1));
    }

    public static int MaxValue(int[] arr){

        int max= Integer.MIN_VALUE;          // For Min arr use Integer.MAX_VALUE

        for(int each: arr){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
   //--------------------------------------------SECOND WAY------------------
    public static int MaxValue2(int[] arr2){
        Arrays.sort(arr2);

        return arr2[arr2.length-1];
    }
}
