package cybertek.Do_while_Loops;

import java.util.Scanner;

public class challange1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 =0;
        int num2 =0;
        int result =0;
        int attempts =3;
        do{
            System.out.println("Enter the first number : ");
            num1 =scan.nextInt();
            System.out.println("Enter the second number : ");
            num2 =scan.nextInt();
            result=num1+num2;
            if(attempts==0){
                System.out.println("You exceeded the number of attempts");
            }
            attempts--;
        } while(result<=100);
        System.out.println("The End "+ result);

    }

}
