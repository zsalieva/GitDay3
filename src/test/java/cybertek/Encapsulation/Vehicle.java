package cybertek.Encapsulation;

public class Vehicle {
    private String type;
    private String make;
    private String model;
    private int speed;

// Create constractor as the same name as class name
    public Vehicle(){
        System.out.println(" We created Vehicle CONSTRACTOR: it is created when new Obj been created ");
        type="unknown";
        model="unknown";
        make="unknown";
    }   //Constructor with parameters
    public Vehicle(String type, String model, String make){
        System.out.println(" 3 Args Constructor ");
        this.type=type;
        this.model= model;
        this.make=make;
    }


    public void acelarate(int mph){
        speed+=mph;
        System.out.println(make+" "+type+" is acelarating.");

    }
    public String getType(){
        return type;

    }
    public String getMake(){
        return make;

    }
    public String getModel(){
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setType(String type){
        this.type=type;
    }
    public void setMake(String make){
        this.make=make;
    }
    public void setModel(String model){
        this.model=model;

    }
    public void setSpeed(int speed){
        this.speed =speed;
    }
}
