package cybertek.interview_Java_Q;

public class Occurancy_Of_Num_Char {

    public static String StrNum(String str){
                                             //  final int MAX_CHAR = 256;
        String result ="";
        int count =1;

        for(int i=0; i<str.length()-1; i++){

            if(str.charAt(i)==str.charAt(i+1)){
                count++;
                continue;

            }else
            {
                result= result+" "+str.charAt(i)+count;    // A2B3D4
            }
            count=1;
        }
        result= result+" "+str.charAt(str.length()-1);
        return result;
    }

    public static void main(String[] args) {
        String word ="AABBBDDDDCCEF";
        StrNum(word);
        System.out.println(StrNum(word));
    }
}
