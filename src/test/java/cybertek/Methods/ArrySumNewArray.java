package cybertek.Methods;

import java.util.Arrays;

public class ArrySumNewArray {

    public static void main(String[] args) {
         int[] a=new int[]{2,4,5,6,7};
        int[] b=new int[]{4,46,15,6,7};

        int[] result = ArraySum2(a,b);
        System.out.println(Arrays.toString(result));
    }
    public static int[] ArraySum2(int[] arr1, int[] arr2){
        // arr1 and arr2 have same length 5

        int[] newArray= new int[arr1.length];
        for(int i=0; i<newArray.length;i++){
            newArray[i]= arr1[i]+arr2[i];
        }
        return newArray;
    }
}
