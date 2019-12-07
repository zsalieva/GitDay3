package cybertek.Object_Class;

public class EmployeVerify {
    public static void main(String[] args) {


        Employee e = new Employee();

        e.name= "Karlson";
        e.email="k34@gmail.com";
        e.jobTitle = "Side Relibility";
        e.salary = 130000;

        System.out.println(e.name);
        System.out.println(e.email);
        System.out.println(e.jobTitle);
        System.out.println(e.salary);
        e.work();
    }
}