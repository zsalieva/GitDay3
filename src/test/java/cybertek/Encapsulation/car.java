package cybertek.Encapsulation;

public class car {
    public static void main(String[] args) {


        Vehicle car1 = new Vehicle();


        car1.setMake("SUV");
        car1.setModel("Acura");
        car1.setType(" Hybrid ");
        car1.setSpeed(200);

        System.out.println(car1.getMake()+ " "+car1.getModel()+" "+car1.getType()+" "+car1.getSpeed());

        car1.acelarate(100);
        System.out.println(car1.getSpeed());

        Vehicle car2 = new Vehicle();
        System.out.println(car2.getMake());  //these all will print unknown since we have given values unknown in constractor method
        System.out.println(car2.getModel());
        System.out.println(car2.getType());

        Vehicle car3 = new Vehicle("Sports Car", "Luxcury","Highlender");  //it allows because of Constructors with 3 parameters
        System.out.println(car3.getType());             // been created in Vehecle class.
        System.out.println(car3.getModel());
        System.out.println(car3.getMake());


    }
}