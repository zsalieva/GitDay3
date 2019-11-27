package cybertek.interview_Java_Q;

public class Remove_Dublicates {
     public static String Dublicates(String str){
         String result ="";

         for(int i=0; i<str.length()-1;i++){

             if(!(result.contains(str.substring(i,i+1)))){
                     result= result+" "+ str.substring(i,i+1);
                 }
             }

         return result;
     }

    public static void main(String[] args) {
         String word ="ABFBCDCDFF";
        Dublicates(word);
        System.out.println( Dublicates(word));
    }
}
