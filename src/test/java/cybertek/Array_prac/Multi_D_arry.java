package cybertek.Array_prac;

import java.util.Arrays;

public class Multi_D_arry {
    public static void main(String[] args) {


    int[][] arr =new int[2][3];

    arr[0][0]=10;
    arr[0][1]=20;
    arr[0][2]=30;
    arr[1][0]=40;
    arr[1][1]=50;
    arr[1][2]=60;

        System.out.println(arr[0][0]);
        System.out.println(arr[0][2]);
        System.out.println("legth of arr "+ arr.length);
        System.out.println("length of first array inside arr "+ arr[0].length);
        System.out.println("length of second array inside arr "+ arr[1].length);

    int[][]nums={{10,30,40},{20,40,50},{70,80}};


        System.out.println(nums.length);

        System.out.println("legth of nums "+ nums.length);
        System.out.println("length of first array inside nums "+ nums[0].length);
        System.out.println("length of second array inside nums "+ nums[1].length);

}}
