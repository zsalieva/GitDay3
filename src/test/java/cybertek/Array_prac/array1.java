package cybertek.Array_prac;

public class array1 {
    public static void main(String[] args) {


        int[] arr = new int[3];

        arr[0]=3;
        arr[1]=2;
        arr[2]=4;
        System.out.println(arr[1]);

        double[] d= new double[4];

        d[0]=2.3;
        d[1]=4.1;
        d[2]=3.5;
        d[3]=4.0;

        System.out.println(d[2]);


     int[]nums2 = new int[]{2,4,5,7,8,9};

     String names[]={"Allo","Nelo","polo","Sholo"};

        System.out.println(names[2]);
        System.out.println(names[names.length-1]);// getting last

        names[2]="Mubarel";
        System.out.println(names[2]);


    }
}