package cybertek.Array_prac;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();
        
    System.out.println("How may items in Array?");
        int count = scan.nextInt();

        int[]nums = new int[count];
        for(int i=0; i<count; i++) {
       //    nums[i] = ran.nextInt(100);
        }
        for (int n: nums){
            System.out.println(n+",");
        }

}

}
