package cybertek.ArrayList;
import java.util.*;
public class ArrayList_Random {
    public static void main(String[] args) {

       ArrayList<Integer> numbers = returnList(5);
        System.out.println(numbers);
    }

    public static ArrayList<Integer> returnList(int count){
        Random random = new Random();
        ArrayList<Integer> nwList = new ArrayList<>();
        for(int z=0; z<=count;z++){

            nwList.add(random.nextInt(101));

        }
        return nwList;
    }
}
