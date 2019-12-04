package cybertek.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrLst2 {
    public static void main(String[] args) {


        ArrayList<String> cities = new ArrayList<>();

        cities.add("Colorado");
        cities.add("Taywan");
        cities.add("Misigin");
        cities.add("Iyova");
        cities.add("Cambochya");
        cities.add("Mozambiya");

        System.out.println(cities.size());
        System.out.println(cities.get(0));

        for(String city: cities){
            System.out.print(city+" | ");
        }
        System.out.println();

        for(int i=0; i<cities.size(); i++){
            System.out.println(cities.get(i)+"|");
        }

        ArrayList<String> LongNames = new ArrayList<>();
        LongNames.add("Pitirburg");
        LongNames.add("Holahoop");
        LongNames.add("Eketerinburg");
        LongNames.add("Bolewood");

        for(String city1:cities){
            if(city1.length()>6){
                LongNames.add(city1);
            }
        }
        System.out.println(LongNames);
        LongNames.clear();
        System.out.println(LongNames.isEmpty()+ " "+ (LongNames.size()==0));

        for(int i=0; i<cities.size();i++){
            String city2= cities.get(i);
            if(city2.length()>6){
                LongNames.add(city2);
                System.out.println(LongNames.size()+ " Long total size");
                System.out.println(LongNames);
            }
        }

        Integer[]nums ={34,5,6,7,89,34};
        List<Integer> numList= Arrays.asList(nums);
        System.out.println(numList.size());
        System.out.println(numList);

        List<String> cityNames= Arrays.asList(new String[]{"Tokya","HOllanda","Azerbajan","Baku"});
        System.out.println(cityNames.size());
        System.out.println(cityNames);
       // cityNames.add("Konya");
        System.out.println(cityNames);

        cities.addAll(cityNames);
        System.out.println(cities.addAll(cityNames));
        System.out.println(cities);
        cities.remove(0);
        System.out.println(cities);
        cities.remove("Baku");
        System.out.println(cities);
    }
}