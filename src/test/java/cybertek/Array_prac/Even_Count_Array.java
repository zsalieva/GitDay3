package cybertek.Array_prac;

public class Even_Count_Array {
    public static void main(String[] args) {
        int[]nums={2,2,2,3,4};
        int[]num={1,3,5,7,9};
        System.out.println(Even_Array(num));

    }

    public static int  Even_Array(int[] arr){
        int count =0;
        for(int i=0; i<arr.length; i++){

            if((arr[i]%2==0)){
                count ++;
            }

        }
        return count;
    }
}
