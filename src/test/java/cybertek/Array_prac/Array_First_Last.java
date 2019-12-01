package cybertek.Array_prac;

public class Array_First_Last {
    public static void main(String[] args) {
        String[] words={"hellooo", "by","were","look","dogs"};
        System.out.println(First_last(words));
    }
    public static String First_last(String[] str){
        String result="";
        for(int i=0; i<str.length; i++){
            System.out.println(str[i].charAt(0) + " "+ str[i].charAt(str[i].length()-1));
            result= str[i].charAt(0) + " "+ str[i].charAt(str[i].length()-1);
        }
        return result;
    }

}
