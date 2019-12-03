package cybertek.Methods;

import java.util.*;

public class getMax {
    public static void main(String[] args) {

        System.out.println("the max value is: "+ getMax());
    }
    public static int getMax() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the fisrt number?");
      int  i = scan.nextInt();
        System.out.println("Enter the second number");
     int   j= scan.nextInt();
        int max;
        if(i>j){
            max=i;
        }else {
            max=j;
        }
      return max;

    }
}
