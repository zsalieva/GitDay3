package cybertek.Object_Class;

public class Dog {
    String name;
    String bark;
    String eat;
    String run;
    int size;



    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark= "How How";
        dog.eat = " Bones";
        dog.name= "Barsi";
        dog.run = "Reallly fast";
        dog.size = 100;
        System.out.println(dog.name+ " it eats "+ dog.eat+" the size is  "+dog.size+" Lb  and it runs"+ dog.run);
    }
}
