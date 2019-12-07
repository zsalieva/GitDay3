package cybertek.Encapsulation;

public class Library {
    public static void main(String[] args) {

        Book book1 = new Book();    //Create a new Obj
        book1.setAuthor("Mark Smith");   // Use SET method to assign value to it
        book1.setPages(234);
        book1.setTitle("Silence");

        //---------------------------
        Book book2 = new Book();
        book2.setTitle("Success");
        book2.setPages(500);
        book2.setAuthor("Angelica");


        System.out.println("Book1 Author "+book1.getAuthor());  //Use GET method to  Get the value
        System.out.println("Book1 pages "+book1.getPages());
        System.out.println("Book1 Title "+book1.getTitle());
        System.out.println("------------------------------------------------");

        //-----------------------------
        System.out.println("Book2 title "+book2.getTitle());
        System.out.println("Book2 Pages "+book2.getPages());
        System.out.println("Book2 Author "+book2.getAuthor());
    }
}
