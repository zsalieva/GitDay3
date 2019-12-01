package cybertek.Array_prac;

import java.util.Arrays;

public class String_Split {
    public static void main(String[] args) {
        String words =" java-selenium-cucumber-testng-Junit-eclipse-maven-git-gutHub";

        String[] splitedWords=words.split("-");
        System.out.println(Arrays.toString(splitedWords));
        System.out.println(splitedWords.length);
        System.out.println(splitedWords[0]);

        for(String str:splitedWords){
            System.out.println(str+" ");
        }
        String sentenses  = "All categories wooden spoon 13,654 Results.";
        sentenses.split(" ");
        String[] str1= sentenses.split(" ");
        System.out.println(str1.length);
        System.out.println(sentenses.split(" ").length); // will give the same result as array length
        System.out.println(sentenses.split(" ")[0]);
        System.out.println(str1[4]);   // print the 13,654
    }
}
