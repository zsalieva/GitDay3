package cybertek.interview_Java_Q;

public class Prime_Numbers {
    public static String Prime(int num){
        int m=0, flag=0; String result="";
        m= num/2;

        if(num<=1){
            return "NOT PRIME";
        }
        else{
            for(int i=2; i<=m; i++){
                if(num%i==0){
                    result+="NOT A PRIME";

                    flag =1;

                    break;

                }

            }}
            if(flag==0){
               result+="PRIME PRIME HE HAAA";
            }


       return result;
    }

    public static void main(String[] args) {

        Prime( 29);
        System.out.println(Prime(31));
    }

}
