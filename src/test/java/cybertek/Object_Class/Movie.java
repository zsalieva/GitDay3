package cybertek.Object_Class;

public class Movie {
    String name;
    int length;

    public void Watchmovie(){
        System.out.println("Watching a movie"+name+length);

    }
    public void buy(double price){
        System.out.println("Buying the movie for: "+ price);
    }
}
