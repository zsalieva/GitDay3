package cybertek.interview_Java_Q;

public class Fizz_Buzz {

    static void fizzBuzzChallenge(){
        for (int i = 1; i <=100 ; i++) {
            if(i%15==0)
                System.out.print("Fizz Buzz,");
            else if(i%3==0)
                System.out.print("Fizz, ");
            else if(i%5==0)
                System.out.print("Buzz, ");
            else
                System.out.print(i + ", ");
        }
    }

    public static void main(String[] args) {
        fizzBuzzChallenge();
    }
}
