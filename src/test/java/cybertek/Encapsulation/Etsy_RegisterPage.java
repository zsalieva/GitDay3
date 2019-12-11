package cybertek.Encapsulation;

public class Etsy_RegisterPage {

    public static void main(String[] args) {

        EtsyCreateAccount create = new EtsyCreateAccount();
        // Now we can create all in one shot
        create.setInfo("123Heroy","Hamido","shahlo@gmail.com");

        create.setEmail(create.getEmail().replace("@gmail.com","@yahoo.com"));
        System.out.println("Your Email "+create.getEmail());
        System.out.println("Your First name "+create.getFirstname());
        System.out.println("Your Password "+create.getPassword());
        System.out.println("-----------All in one-----------");
        System.out.println(create.getInfo());

        EtsyCreateAccount yourAcount= new EtsyCreateAccount();
        yourAcount.setInfo("123lola", "Latif","latif@gmail.com");
       // yourAcount.getInfo();
        System.out.println(yourAcount.getInfo());  // To print all in one
    }
}
