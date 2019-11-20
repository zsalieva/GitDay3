package cybertek.interview_Java_Q;

public class Reverse_a_String {

      public static String reverse(String str){
          String result ="";
          for(int i= str.length()-1; i>=0; i--){
             result+= str.charAt(i);

          }

          return result;
      }


    public static void main(String[]args){
      //1st WAY
     reverse("How are you");
        System.out.println(reverse("How are you"));

        //2nd WAY
        System.out.println(rev("Hello MOTO"));

    }

  //  ----------------- SECOND WAY-------------------------------

    public static String rev(String str){
          StringBuilder sb = new StringBuilder(str);
          String result = "" ;
          result+=sb.reverse();
        return result;
    }

}
