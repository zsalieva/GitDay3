package cybertek.interview_Java_Q;

public class Second_H_Array {

    public static int Second_H(int[] arr1){
        int highest = Integer.MIN_VALUE;
        int second =Integer.MIN_VALUE;

        for (int i=0; i<arr1.length; i++){

            if(arr1[i]> highest){
                second=highest;
                highest=arr1[i];

            }
            else if(arr1[i]>second){
                second=arr1[i];

            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr ={34,6,7,12,8,9,4};

        System.out.println(Second_H(arr));
    }

}
