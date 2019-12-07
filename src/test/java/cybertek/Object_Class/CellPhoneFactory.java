package cybertek.Object_Class;

import cybertek.Object_Class.CellPhone;

public class CellPhoneFactory {
    public static void main(String[] args) {

        CellPhone phone1 = new CellPhone();
        phone1.brand= "Apple Iphone";
        phone1.color="Grey";
        phone1.price=995.7;
        phone1.call();
        phone1.text();
        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.price);

        CellPhone phone2= new CellPhone();
        phone2.brand="Samsung";
        phone2.color="Red";
        phone2.price= 567.7;
        phone2.call();
        phone2.text();

        System.out.println(phone2.brand);
        System.out.println(phone2.color);
        System.out.println(phone2.price);

        /// How to add total price of two phones
       double total= phone1.price+phone2.price;
        System.out.println("The TOTAL PRICE IS : "+total);


    }
}
