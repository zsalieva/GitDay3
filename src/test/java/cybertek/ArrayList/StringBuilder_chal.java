package cybertek.ArrayList;

public class StringBuilder_chal {

    public static void main(String[] args) {

        String[] words= {"Hello","I'm comming","soon"};
              StringBuilder sb1 =ArrayToStb(words);
        System.out.println(sb1.toString());
    }


    public static StringBuilder ArrayToStb(String[] arr){
        StringBuilder  sb2 = new StringBuilder();
        String result="";
        for(String each: arr){
           sb2.append( each);

        }

        return sb2;
    }
}
