package cybertek.Object_Class;

public class Employee {
    String name;
    String email;
    String jobTitle;
    int salary;

    public void work(){
        System.out.println(name+ " works as a "+ jobTitle);
    }

    public static void main(String[] args) {   // We can create main in same class or different class

      Employee e1 = new Employee();
      e1.name= "Peterson";
      e1.jobTitle="SDET";
      e1.salary=120000;
      e1.email= "cool1@gmail.com";
        System.out.println(e1.name);
        System.out.println( e1.jobTitle);
        System.out.println( e1.salary);
        System.out.println(e1.email);
        e1.work();
    }
}