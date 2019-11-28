package cybertek.Do_while_Loops;

public class Finding_lowerCaseCharsOnly {

    public static void main(String[] args) {
        String word = "5Litlle Monkey jumping on The Bed HEY";
        System.out.println(LowerCase(word));
    }
    public static String LowerCase(String str){
        String result="";
        for(int i=0; i<str.length(); i++){
            char each = str.charAt(i);
            if(each>='a' && each <='z'){
                result+=each;
            }

        }
        return result;
    }
}
