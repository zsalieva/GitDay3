

public class Reverse_a_String {

      public static String reverse(String str){
          String result ="";
          for(int i= str.length()-1; i>=0; i--){
             result+= str.charAt(i);

          }

          return result;
      }


    public static void main(String[]args){

     reverse("How are you");
        System.out.println(reverse("How are you"));

    }

}
