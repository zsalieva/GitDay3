package cybertek.Methods;

public class palindrome_boolean {
    public static void main(String[] args) {
        boolean isPal =isPalindrome("civic");
        System.out.println(isPal);
    }

    public static boolean isPalindrome(String str){
        String reverse ="";
        for(int i=str.length()-1;i>=0; i--){
            reverse= reverse+str.charAt(i);

            }
        if(reverse.equals(str)){
            return true;
        }else{
        return false;
        }
    }
}
