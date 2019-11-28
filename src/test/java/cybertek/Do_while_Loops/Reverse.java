package cybertek.Do_while_Loops;

public class Reverse {
    public static void main(String[] args) {


    String word = "Hello Moto";
    String result ="";

    for(int i=word.length()-1; i>=0;i--){


        System.out.print(word.charAt(i));
    }
}}
