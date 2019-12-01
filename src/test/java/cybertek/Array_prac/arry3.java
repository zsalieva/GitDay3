package cybertek.Array_prac;

public class arry3 {
    public static void main(String[] args) {

// Array fixed size will not be small or large but we can modify the valuies when ever ou want. kitchenItem[0]="cap"
        String[] kitchenItems = {"knife", "woodenSpoon", "plates", "forks", "pan", "pot", "trash", "fridge", "dishwasher"};

        for (String item: kitchenItems){
             item= item.toLowerCase().trim();
               switch(item){
                   case "knife":
                       System.out.println("veggies");
                       break;
                   case "woodenSpoon" :
                       System.out.println("Mix the soup");
                       break;
                   case "plates":
                       System.out.println("Eat food");
                       break;
                   case "forks"    :
                       System.out.println("Eat Salad");
                       break;
                   case "pan":
                       System.out.println("Cook food");
                       break;
                   case "pot":
                       System.out.println("Cook Egg");
                       break;

                   case "trash":
                       System.out.println("keep the Trash");
                       break;
                   case "fridge":
                       System.out.println("Keep all food fresh");
                       break;
                   case "dishwasher":
                       System.out.println("Clean the plates");

                       break;
                   default:
                       System.out.println( "Done for today!!!!");


               }

        }
    }
}
