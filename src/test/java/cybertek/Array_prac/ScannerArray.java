package cybertek.Array_prac;

import org.apache.logging.log4j.core.util.JsonUtils;

import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many items in an Array?");
        int count = scan.nextInt();

        int[]nums = new int[count];

        // using a loop enter the count

          for(int i=0; i<count;i++){
              System.out.println("Enter the number"+ (i+1));

              nums[i] = scan.nextInt();
        }
          for(int n: nums) {
              System.out.println(n+" ");
          }
        System.out.println();

          int lasgest =nums[0];

          for(int num: nums){
              if (num>lasgest){
               lasgest= num;
              }
          }
        System.out.println("Largest value : "+ lasgest);
    }


}
