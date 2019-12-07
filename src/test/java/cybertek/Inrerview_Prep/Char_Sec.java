package cybertek.Inrerview_Prep;

public class Char_Sec {
    //Write a return method that can find the frequency of characters
    //
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    //
    //solution 1:
    public static void main(String[] args) {
           String word ="AAABBCD";

        System.out.println(CharCount(word));
    }

    public static String CharCount(String str){

        String result ="";
        int count =1;

        for(int i=0; i<str.length()-1; i++){

            if(str.charAt(i)==str.charAt(i+1)){
                count ++;
                continue;
            }
            else{
                result= result+" "+str.charAt(i)+count;
            }
            count =1;
            result=result+" "+str.charAt(str.length()-1);
        }
        return result;

    }
}
