package cybertek.Collections;
import java.util.*;
public class Collection_Prac {
    public static void main(String[] args) {


        Collection<Integer> coll = new ArrayList<>();

       // Adding item; it will return --> boolean as well

        coll.add(3);
        coll.add(56);
        coll.add(13);
        System.out.println(coll);

        // Adding multiple item in one shot

        coll.addAll(Arrays.asList(3,5,6,7,8,9,45));
        System.out.println(coll);

        //Getting size
        System.out.println("coll.size ->"+coll.size());

        // Cheking is empty or not --> return boolean

        System.out.println("coll.isEmpty ->"+ coll.isEmpty());

        //remove item

        System.out.println("remove an item 7 ->"+  coll.remove(7));
        System.out.println(coll);

        //contains item

        System.out.println("coll.contains(7) ->"+ coll.contains(7));

        //containsAll items

        System.out.println("coll.containsAll ->"+ coll.containsAll(Arrays.asList(3,5,6)));

        //removeAll
        System.out.println("coll.removeAll ->"+ coll.removeAll(Arrays.asList(8,9,45)));


        //retain All  -> removes common part and give uncommon once
        System.out.println(coll.retainAll(Arrays.asList(9,45)));



    }
}
