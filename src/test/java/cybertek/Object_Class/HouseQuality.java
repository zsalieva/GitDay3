package cybertek.Object_Class;

import cucumber.api.java.bs.A;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseQuality {
    public static void main(String[] args) {


        House h = new House();
        House h1 = new House();
        House h2 = new House();
        House h3 = new House();

        h.bedrooms = 3;
        h.location = "Chicago IL";
        h.type = "Big";
        h.year = 2016;

        h1.bedrooms = 2;
        h1.location = "CA";
        h1.year = 2019;
        h1.type = "Town HOuse";

        h2.bedrooms = 1;
        h2.location = "Gorgia";
        h2.year = 2015;
        h2.type = "Small Apt HOuse";

        h3.bedrooms = 5;
        h3.location = "LA";
        h3.year = 2018;
        h3.type = "Single house";

        System.out.println("The house is \n" + h.type +
                " build in \n" + h.year +
                " the location is \n" +
                h.location + " the bedrooms "
                + h.bedrooms);


        System.out.println(h1.type);
        System.out.println(h1.bedrooms);
        System.out.println(h1.location);
        System.out.println(h1.year);

        System.out.println(h2.type);
        System.out.println(h2.bedrooms);
        System.out.println(h2.location);
        System.out.println(h2.year);

        System.out.println(h3.type);
        System.out.println(h3.bedrooms);
        System.out.println(h3.location);
        System.out.println(h3.year);

        int[] nums = new int[3];
        nums[0] = 23;

        String[] str = new String[4];
        str[0] = "Bamboo";

        House[] houses = new House[4];
        houses[0] = h;
        houses[1] = h1;
        houses[2] = h2;
        houses[3] = h3;
        System.out.println("-------------------------");
        System.out.println(houses[0].location);

        for (House house : houses) {
            System.out.println(house.location + " ==> " + house.type);
        }
        System.out.println("======Using for loop=======");
        for (int i = 0; i < houses.length; i++) {
            System.out.println(houses[i].type + " ==> " + houses[i].location);
        }
        System.out.println("------------USING ARRAYLIST-------------");

        ArrayList<House> houseList = new ArrayList<>();
        houseList.add(h);
        houseList.add(h1);
        houseList.add(h2);
        houseList.add(h3);

        ArrayList housesList2 = new ArrayList<>(Arrays.asList(houses));
        System.out.println();


        for (int i = 0; i < houseList.size(); i++) {
            House temp = houseList.get(i);
            if (temp.year >= 2006 && temp.year <= 2018) {
                System.out.println("Years of the houses between 2006 and 2018 " + temp.year + " | " + temp.location);

            }
        }
        System.out.println("----------------------------------");
        for (House each : houseList) {
            int year = each.year;
            if (year >= 2006 && year <= 2016) {
                System.out.println(year + " 2006 --> 2016 " + each.location);
            }
        }
    }


}








