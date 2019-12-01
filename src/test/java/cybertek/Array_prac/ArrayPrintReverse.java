package cybertek.Array_prac;

public class ArrayPrintReverse {
    public static void main(String[] args) {

        int[] arr ={12,4,56,7,3,22,6,56,6,34};

        if(arr.length==10){
            System.out.println("10 points found");
        }
        else{
            System.out.println("we need 10");
        }
        int result =0;

        for (int i = arr.length-1;i>=0; i--){


            System.out.print(arr[i]+"");
        }


        System.out.println("-----------------------------");

        int arr1[]={12,34,56,67,89,9,45,55,4};
        boolean found =false;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]==19){
                System.out.println("the value 9 is found index "+i );
                found=true;
                break;
            }

        }
        if(found==false){
            System.out.println("Not found");
        }
    }
}
