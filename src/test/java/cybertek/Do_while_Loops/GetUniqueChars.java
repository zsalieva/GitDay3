package cybertek.Do_while_Loops;

public class GetUniqueChars {
    public static void main(String[] args) {
        CharUnique("HHBBTrTDDS");
        System.out.println(CharUnique("HHBBTrTDDSTS1"));

    }
    public static String CharUnique(String str){
        String res ="";
        for(int i=0 ; i<str.length();i++){
              String w1 = str.charAt(i)+"";
            if(res.contains(w1)){
                System.out.println(w1 +" <-- Dublicate");
            }
            else{
                res=res+w1;
            }

        }
        return res;
    }
}
