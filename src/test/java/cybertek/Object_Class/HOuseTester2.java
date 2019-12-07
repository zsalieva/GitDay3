package cybertek.Object_Class;

public class HOuseTester2 {
    public static void main(String[] args) {

       House newHouse = buildHouse("Haloween","Antepya",2017,6);
        System.out.println( newHouse.location +" "+newHouse.bedrooms+" "+newHouse.type+" "+newHouse.year);
    }

    public static House buildHouse(String type,String location,int year,int bedrooms){

        House house3= new House();
        house3.type=type;
        house3.location=location;
        house3.year = year;
        house3.bedrooms= bedrooms;

        return house3;



    }
}
