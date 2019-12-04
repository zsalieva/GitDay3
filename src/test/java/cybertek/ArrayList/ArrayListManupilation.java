package cybertek.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListManupilation {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        List<String> fruits1= new ArrayList<>();
        List<String> fruits2= new ArrayList<>(10);
        ArrayList<String> fruits3 = new ArrayList<>(fruits);
        List<String> fruits4 = Arrays.asList(new String[]{"watermelon","Apple","Peach","Coconat"});
        List<String> fruits5 = new ArrayList<>(Arrays.asList(new String[]{"bananana","orange","cherry"}));
        fruits5.contains("watermelon");
        System.out.println(fruits5.contains("watermelon"));
        fruits5.add("Anor");
        System.out.println(fruits5);
        fruits5.add(1,"Hurma");
        System.out.println(fruits5);
        System.out.println(fruits5.toString());
        fruits5.addAll(fruits4);
        System.out.println(fruits5);
        fruits5.clear();
        System.out.println(fruits5);
        fruits5.addAll(fruits4);
        System.out.println(fruits5.isEmpty());
        fruits5.set(0,"Aloo");
        System.out.println(fruits5);

        List<Integer> nums= new ArrayList<>();
        nums.add(23);
        nums.add(34);
        nums.add(44);
        nums.add(43);
        System.out.println(nums);
        nums.remove(2);  // index value
        nums.remove(new Integer(23));
        System.out.println(nums);
        nums.set(0,1000);
        System.out.println(nums);



    }
}
