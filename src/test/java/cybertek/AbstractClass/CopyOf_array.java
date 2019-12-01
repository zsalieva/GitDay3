package cybertek.AbstractClass;

import java.util.Arrays;

public class CopyOf_array {
    public static void main(String[] args) {
        int[]a={10,12,3,45,56};
        int[]b= Arrays.copyOf(a,2);
        System.out.println(Arrays.toString(b));

        int[]c =Arrays.copyOf(a,5);  //if the length is bigger then a it will print 0,0,0
        System.out.println(Arrays.toString(c));
    }
}
