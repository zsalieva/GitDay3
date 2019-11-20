package cybertek.interview_Java_Q;

public class Palindrome {

    public static String palin(String str){
        String result ="";

        for(int i=str.length()-1; i>=0; i--){
            result+= str.charAt(i);
        }

        if(result.equals(str)){
            return "Palindrome";
        }
      return "Not a Planindrome Try again";
    }



    public static void main(String[] args) {

        palin("racecar");
        System.out.println( palin("racecar"));

    }


}
