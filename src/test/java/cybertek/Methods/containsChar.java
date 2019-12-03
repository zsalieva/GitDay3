package cybertek.Methods;

public class containsChar {

    public static void main(String[] args) {
      int counter = ContainsChar("BABABABA","b");
        System.out.println(counter);
    }

    public static int ContainsChar(String str, String str2){

        int count =0;
        for(int i=0; i<str.length();i++){
            if(str.substring(i,i+1).equalsIgnoreCase(str2)){
                count++;

            }
            }
        return count;
        }

    }

