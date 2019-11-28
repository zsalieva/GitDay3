package cybertek.Array_prac;

import java.util.Arrays;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {

        Random ran = new Random();
        //     int random= ran.nextInt(100);
//             System.out.println(random);

        int[] nums = new int[10];
        for(int i=0; i<nums.length; i++){
            nums[i]= ran.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));




    }
}
