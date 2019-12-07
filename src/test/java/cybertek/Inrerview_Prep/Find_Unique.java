package cybertek.Inrerview_Prep;

public class Find_Unique {
    //Write a return  method that can find the unique characters from the String
    //
    //Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

    public static void main(String[] args) {
       String str = "AABBBCCDEF";
      String printUnique = unique_Once(str);
        System.out.println(printUnique);

    }

    public static String unique_Once(String str){

        String[] arr = str.split("");
        String unique="";

        for(int j=0; j<arr.length; j++){

            int count=0;

        for(int i=0; i<arr.length;i++){
            if(arr[i].equals(arr[j])){
            count++;}
        }
        if(count==1){
            unique= unique+arr[j];

        }
        }
        return unique;
    }
}
