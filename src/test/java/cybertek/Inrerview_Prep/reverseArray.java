package cybertek.Inrerview_Prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class reverseArray {

    public static void main(String[] args) {
        Integer [] arr = {10, 20, 30, 40, 50};
           reverse(arr);

    }  /*function reverses the elements of the array*/
        static void reverse(Integer a[]){

            Collections.reverse(Arrays.asList(a));
            System.out.println(Arrays.asList(a));
        }




    public static int findMax(ArrayList<Integer> a) {

        int max=Integer.MIN_VALUE;

        for(int each: a)

            max = Math.max(max, each);

        return max;

    }

        }





