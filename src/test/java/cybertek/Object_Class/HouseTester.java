package cybertek.Object_Class;

public class HouseTester {
    public static void main(String[] args) {

// Create new House object and assign values
        House yourHouse = new House();

        yourHouse.bedrooms = 6;
        yourHouse.year = 2020;
        yourHouse.location = "COLORADO";
        yourHouse.type = "Castle Rock";

        // Create one more new House object and assign values
        House MyHouse = new House();

        MyHouse.bedrooms = 10;
        MyHouse.year = 2020;
        MyHouse.location = "Chicago";
        MyHouse.type = "Castle ";

        HouseBuilder(yourHouse);
        HouseBuilder(MyHouse);
        House coolHouse = buidlA_House("Long House", "Los Angles", 5, 2017);
        System.out.println(coolHouse);
    }

    public static void HouseBuilder(House houseObj) {
        System.out.println("=================");
        System.out.println("House type: "+ houseObj.type);
        System.out.println("House location : "+ houseObj.location);
        System.out.println("House yesr: "+ houseObj.year);
        System.out.println("House bedroom: "+ houseObj.bedrooms);
        System.out.println("=================");

    }
    public static House buidlA_House(String type, String location, int bedrooms, int year){
        House newhouse = new House();
        newhouse.type= type;
        newhouse.location=location;
        newhouse.year = year;
        newhouse.bedrooms=bedrooms;
        return newhouse;
    }
}