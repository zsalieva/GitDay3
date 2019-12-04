package cybertek.ArrayList;

import java.util.ArrayList;
import java.util.*;
public class ArrayListIntro {
    public static void main(String[] args) {


    ArrayList list = new ArrayList();

    list.add(true);
    list.add("gogo");
    list.add('-');
    list.add(34);

        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("----------------------");

    ArrayList<String> list1 = new ArrayList<>();
     list1.add("gogo");
     list1.add("sogo");
     list1.add("PoLO");
     list1.add("Car");

     String first = list1.get(0);              // first value
     String last = list1.get(list1.size()-1);  // Last value
        System.out.println(first+ " first value");
        System.out.println(last+ " last value");

      list1.remove(2);                  // Remove the value


        System.out.println(list1.get(1));
        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println("----------------------");

      ArrayList<Integer> nums = new ArrayList<>();
      nums.add(300);
        nums.add(200);
        nums.add(400);
        nums.add(500);
        System.out.println(nums.toString());  /// you may use this way or just the name
        System.out.println(nums);  /// you may use this way or just the name

        // We can use for eachloop to print as well
        System.out.println("----------------------");

        for(Integer nn:nums){
            System.out.println(nn);
        }
        System.out.println("----------------------");
        for(int nn2:nums){
            System.out.println(nn2);
        }
        System.out.println("----------------------");

        for(int i=0; i<nums.size(); i++){
            System.out.println(nums.get(i));

        }
    }}
