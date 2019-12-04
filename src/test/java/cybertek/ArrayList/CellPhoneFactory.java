package cybertek.ArrayList;

public class CellPhoneFactory {
    public static void main(String[] args) {

        CellPhone phone1 = new CellPhone();
        phone1.brand= "Apple Iphone";
        phone1.color="Grey";
        phone1.price=45.7;
        phone1.call();
        phone1.text();

    }
}
