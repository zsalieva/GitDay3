package cybertek.interview_Java_Q;

import java.util.Arrays;

public class Arr_sort_ASC {
    public Arr_sort_ASC(String[] word) {
    }

    public Arr_sort_ASC(String s) {

    }

    public static String Asc(String[] str){
        Arrays.sort(str);
       String result ="";
       result+= str;
        return result;

    }

    public static void main(String[] args) {
        String[] word;
        word = new String[]{"Heha","Malu","HI","Jeyda","Zebra","Ali","Kabi"};


        System.out.println(new Arr_sort_ASC(word.toString()));

//        new Arr_sort_ASC(word);
//        System.out.println(new Arr_sort_ASC(word.toString()));
    }
}
