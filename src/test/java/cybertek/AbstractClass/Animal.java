package cybertek.AbstractClass;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){  //Constractor
        this.name = name;
        this.age = age;
    }
    public abstract void speak(); // abstract method

    public String toString(){    // Printy print

        return "Animal [name="+name +", age="+age +"]";
    }
}
