package cybertek.Array_prac;

import java.util.Arrays;

public class Aray_Char_Str {
    public static void main(String[] args) {


    String str = "Hello-Spartans";
    int size = str.length();

    char[] chr= new char[size];

    for(int i=0; i<chr.length; i++){
        chr[i]= str.charAt(i);
    }
        System.out.println(Arrays.toString(chr));
//-------------------------------------------------------Easier way------
    char[]myChar = str.toCharArray();
        System.out.println(Arrays.toString(myChar));
}}
