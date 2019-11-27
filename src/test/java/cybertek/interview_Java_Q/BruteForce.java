package cybertek.interview_Java_Q;

import java.util.Scanner;

public class BruteForce {

    public static void main(String[] args) {
        String Expected_username = "admin";
        String Expected_password = "admin123";
        int attempts =5;
        String username =" ";
        String password = "";
        Scanner scan = new Scanner(System.in);

        do{
          if(attempts==0){
              System.out.println("You have exceeded number of attempts");
              System.out.println("This user  has been terminated for 30 minuutes .Try later");
              return;
          }
            attempts--;
            System.out.println("Please enter the username");
            username =scan.next();
            if(!username.equals(Expected_username)){
                System.out.println("Wrong username");
                System.out.println("atempt left "+ attempts);
                continue;
            }
            System.out.println("Please enter the password");
            password = scan.next();
            if(!password.equals(Expected_password)){
                System.out.println("Wrong password ");
                System.out.println("attampts left "+ attempts);
                continue;
            }
        }while(!username.equals(Expected_username) || !password.equals(Expected_password));
        System.out.println("Login successful! ");

    }
}
