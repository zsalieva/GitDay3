package cybertek.Encapsulation;

public class Etsy_RegisterPage {

    public static void main(String[] args) {

        EtsyCreateAccount create = new EtsyCreateAccount();

        create.setEmail("noara@gmail.com");
        create.setFirstname("NOra");
        create.setPassword("123Hero!!");

        System.out.println("Your Email "+create.getEmail());
        System.out.println("Your First name "+create.getFirstname());
        System.out.println("Your Password "+create.getPassword());

    }
}
