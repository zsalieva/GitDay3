package cybertek.Inrerview_Prep;

public class removeDublicates {

    //Write a return method that can remove the duplicated values from String
    //
    //Ex:  removeDup("AAABBBCCC")  ==> ABC
    //Solution 1:
    public static void main(String[] args) {
        String word ="AABBBCCDE";

        String str = dublicates(word);
        System.out.println(str);

    }

    public static String dublicates(String str){
         String noDublicate="";
        for(int i=0 ; i<str.length(); i++){
            if(!noDublicate.contains(""+str.charAt(i))){
                noDublicate= noDublicate+" "+str.charAt(i);
            }
        }
        return noDublicate;
    }
}
