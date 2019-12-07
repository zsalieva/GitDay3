package cybertek.Object_Class;

public class HouseCheck2 {

    public static void main(String[] args) {
        House houseCreate = new House();
        houseCreate.type=" Veteran house";
        houseCreate.location="Ohio";
        houseCreate.bedrooms=3;
        houseCreate.year= 2000;

        HouseBuild2(houseCreate);

        // Creating Second HOuse
        House houseCreate2 = new House();
        houseCreate2.type=" Holiwood house";
        houseCreate2.location="LAsVagas";
        houseCreate2.bedrooms=5;
        houseCreate2.year= 2012;

        HouseBuild2(houseCreate2);
    }
    public static void HouseBuild2(House house){

        System.out.println("HOuse Type"+ house.type);
        System.out.println("HOuse Location"+ house.location);
        System.out.println("HOuse "+ house.location);
        System.out.println("HOuse Year"+ house.year);
        System.out.println("HOuse Check"+ house.bedrooms);

    }
}
