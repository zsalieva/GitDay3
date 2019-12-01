package cybertek.Array_prac;

import java.util.Arrays;

public class Array_Copy {
    public static void main(String[] args) {

        System.out.println("==== Example Run ====");
        String[]arr = {"zero","one","two", "three","four"};
        System.out.println(Arrays.toString(getWithE(arr)));
    }
    
    public static String[] getWithE(String[] arr1){
        int count=0;
        for(int i=0; i<arr1.length;i++) {
            if (arr1[i].contains("e")) {
               // System.out.println(arr1[i]);
                count++;
            }
            }
        String[] arr2 = new String[count];
        int i=0;
        for(int j=0; j<arr1.length;j++){
            if (arr1[j].contains("e")) {
                arr2[i] = arr1[j];
                i++;
            }}
        for(String val: arr2){
            System.out.println(val+" ");
        }
       return arr2;
    }

    }

