package cybertek.Array_prac;



import org.apache.logging.log4j.core.util.JsonUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {

        char[] arr1 = new char[5];
        arr1[0] = 'z';
        arr1[1] = 'u';
        arr1[2] = 'h';
        arr1[3] = 'r';
        arr1[4] = 'a';

        System.out.println(Arrays.toString(arr1));


        char[] arr2 = {'s', 'a', 'l', 'i', 'e', 'v', 'a'};
        for (int i = 0; i < 7; i++) {
            System.out.print(arr2[i]);

        }
        System.out.println();
        System.out.print(Arrays.toString(arr2));
        int count = arr2.length;
        System.out.println();
        System.out.println(arr2[count - 1]);   // last count
        int midd = count / 2;
        System.out.println(arr2[midd]);     // midd index

        // Reverse the arr2
        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            System.out.print(arr2[i]);
        }
        // How to Swap first and last index in array
        System.out.println();
        int[] arr3 = {1, 3, 6, 8, 9, 10};

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
        System.out.println();

        int temp;
        temp = arr3[arr3.length - 1];
        arr3[arr3.length - 1] = arr3[0];
        arr3[0] = temp;

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
        System.out.println("-----------------");

        int[] arr4 = {11, 33, 61, 8, 91, 10};
        int max = arr4[0];

        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max) {
                max = arr4[i];
            }
        }
        System.out.print(max + " <--Max number");

        System.out.println();
        Arrays.sort(arr4);
        System.out.print(arr4[arr4.length - 1] + " max ");

        System.out.println("-----------Scanner use----------");
        Scanner scan = new Scanner(System.in);
        int[] arr5 = new int[3];

        for (int j = 0; j < arr5.length; j++) {
            System.out.println("Enter the value "+ (j+1));
            arr5[j]= scan.nextInt();
            System.out.println(arr5[j]);
        }
        int min =arr5[0];
        for (int j = 0; j < arr5.length; j++) {

            if(arr5[j]<min){
                min = arr5[j];
            }
        }
        System.out.println("min value is : "+ min);
    }
}
