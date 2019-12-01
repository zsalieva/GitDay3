package cybertek.Array_prac;

public class ArrayHas55 {
    public static void main(String[] args) {
        int[] nums={4,5,5,7,8,9};
        int[]num={5,6,7,8,2,7};
        System.out.println(arrHas55(num));
    }
    public static boolean arrHas55(int[] arr){
        for(int i=0; i<arr.length; i++) {
            if ((arr[i]==5) && (arr[i+1]==5)){
                return true;
            }

        }
        return false;
    }
}
