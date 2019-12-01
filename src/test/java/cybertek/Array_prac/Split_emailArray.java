package cybertek.Array_prac;

public class Split_emailArray {
    public static void main(String[] args) {
        String email= "info@cybertek.school.com";
        System.out.println(wordSplit(email));
    }
   public static String wordSplit(String str) {
        String r="";
        String r2="";
       String[] splitted = str.split("@");
       if(splitted.length==2){
           r="email id: "+ splitted[0];
           r2="Email domain: "+ splitted[1];
       }else{
           System.out.println("Envalid value email ");
       }
       return r + "\n"+ r2;
   }
}
