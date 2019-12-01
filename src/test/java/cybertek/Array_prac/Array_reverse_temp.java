package cybertek.Array_prac;

import java.util.Arrays;

public class Array_reverse_temp {

    public static void main(String[] args) {

        int[] nums={12,4,5,6,7,8,9};

//        int temp=0;
//        temp= nums[0];
//        nums[nums.length-1]= temp;
//        nums[0]=nums[nums.length-1];
//
//        temp = nums[1];
//        nums[nums.length-2]=temp;
//        nums[1]=nums[nums.length-2];
//
//        temp = nums[2];
//        nums[nums.length-3]=temp;
//        nums[2]=nums[nums.length-3];

        int count= nums.length;
        int lastIndex= count-1;

        for(int i=0; i<count/2; i++){
            int temp=nums[i];
            nums[i]= nums[lastIndex-i];
            nums[lastIndex-i]=temp;

        }


        System.out.println(Arrays.toString(nums));
    }
}
