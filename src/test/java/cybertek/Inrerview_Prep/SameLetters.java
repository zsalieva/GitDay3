package cybertek.Inrerview_Prep;

import java.util.Arrays;

public class SameLetters {
    //Write a return method that check if a string is build out of the same letters as another string.
    //
    //Ex:  same("abc",  "cab"); -> true
    //
    //same("abc",  "abb"); -> false:
    //
    //
    //
    //Solution 1:

    public static void main(String[] args) {

        String word1= "acc";
        String word2 ="Acb";
        sameLetters(word1,word2);
        System.out.println(sameLetters(word1,word2));

    }

    public static boolean sameLetters(String str1, String str2){

        char[] ar1 = str1.toCharArray();
        char[] ar2 = str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);
        String a="";
        String b ="";

        for(char each1:ar1){
            a+=each1;

        }
        for(char each2:ar2){
            b+=each2;

        }

      return a.equalsIgnoreCase(b);
    }
}
