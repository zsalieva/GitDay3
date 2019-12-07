package cybertek.Object_Class;

public class DogRunner {
    public static void main(String[] args) {


        Dog doggy = new Dog();

        doggy.eat= "Bread";
        doggy.run =" Not fast";
        doggy.size = 34;
        doggy.name ="Buldog";
        doggy.bark = "Havuuuuu";

        System.out.println("Dog name "+ doggy.name+ " eats "+doggy.eat+ " runs "+doggy.run+ " size is "+ doggy.size+" lb");
    }
}