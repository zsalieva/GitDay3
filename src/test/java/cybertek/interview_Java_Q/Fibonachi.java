package cybertek.interview_Java_Q;

public class Fibonachi {

    //Fibonachi : Add the two previous numbers each time.

    public static int Fibonachi1(int num){
        int a= 0;
        int b= 1;
        int c = 0;
        for(int i=2; i<num; i++){
           c=a+b;
            a=b;
            b=c;


        }
        return c;
    }

    public static void main(String[] args) {
        int n=10;
        Fibonachi1(n);
        System.out.println(Fibonachi1(n));
    }
}
