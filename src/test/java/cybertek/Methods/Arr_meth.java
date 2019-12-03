package cybertek.Methods;

import java.sql.SQLOutput;

public class Arr_meth {
    public static void main(String[] args) {
        int[] a = new int[]{2,4,55,6,71,8};
        int[]b= new int[]{4,6,7,9,8,9};
        int maximum = ArraySum(a,b);
        System.out.println(maximum);
    }


    public static int ArraySum(int[]arr1,int[]arr2){
       int sum1=0;
       int sum2=0;
       int max=0;
        for(int i=0; i<arr1.length;i++){
            sum1=sum1+arr1[i];
        }
        for(int i=0; i<arr2.length;i++){
            sum2=sum2+arr2[i];
        }
        if(sum1>sum2){
            System.out.println("First array greater");
            return sum1;
        }
        else{
            System.out.println("Second array greater");

            return sum2;
        }
       // return max;
    }
}
