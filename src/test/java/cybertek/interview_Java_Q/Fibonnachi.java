package cybertek.interview_Java_Q;

public class Fibonnachi {
    // What is Factorial? -->  5! =5*4*3*2*1 =
    public static int Factorial(int num){
        int factorial_sum =1;
        for (int i=1; i<= num; i++){

            factorial_sum = factorial_sum * i;

        }
        return factorial_sum;
    }

    public static void main(String[] args) {
        int number= 5;
        Factorial(number);
        System.out.println( Factorial(number));

    }

}
