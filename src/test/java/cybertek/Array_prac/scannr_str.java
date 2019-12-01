package cybertek.Array_prac;

import java.util.Scanner;

public class scannr_str {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = scan.nextLine();
        System.out.println("Enter the Char to look for?");
        String userChar = scan.nextLine();
        char charToLookFor = userChar.charAt(0);

        char[] chr1 = str.toCharArray();
        int count=0;
        for(int i=0; i<chr1.length;i++){
            if(chr1[i]== charToLookFor){
                count++;

            }

        }
        System.out.println("the count : "+ count);


    }
}
