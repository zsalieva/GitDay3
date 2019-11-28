package cybertek.Do_while_Loops;

public class GetUnique2 {
    public static void main(String[] args) {
        String word ="AAbbcbDDaD";
        unique(word);
        System.out.println( unique(word));
    }

    public static String unique(String str){
        String eachChar ="";

        for(int i=0 ; i<str.length(); i++){
            String str2 = str.substring(i,i+1);

            if(!eachChar.contains(str2)){
                eachChar+= str2;
            }
        }

      return eachChar;
    }
}
