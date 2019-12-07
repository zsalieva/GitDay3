package cybertek.Object_Class;

public class MovieTester {
    public static void main(String[] args) {


        Movie mov = new Movie();
        mov.name="JUMANJI";
        mov.length = 2;
        System.out.println("MOvie name is: "+mov.name);
        System.out.println(mov.length+" hours long");
        mov.Watchmovie();

        Movie mov2 = new Movie();
        mov2.Watchmovie();
        mov2.name="StarWars";
        mov2.length= 130;
        System.out.println("MOvie name is: "+mov2.name);
        System.out.println(mov2.length+" hours long");
        mov.buy(45.6);
        mov2.buy(33.2);
    }
}