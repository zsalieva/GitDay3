package cybertek.Array_prac;

import java.util.Scanner;

public class String_Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr[]= new String[5];
        for(int i=0; i<5; i++){
            arr[i]= scan.nextLine();
        }
        for(int i=0; i<3; i++){
            arr[i].substring(0,3);
            System.out.println(arr[i].substring(0,3));
        }

    }
}
