package cybertek.Array_prac;

import java.util.Arrays;

public class Cars_MultiDArr {
    public static void main(String[] args) {

        String[][]cars= new String[][]{
                {"Japaneese","German","American","Italian"},
                {"Honda","Audi","porche","VW",},
                {"Dodge","Linlton","jeep","tesla"},
                {"Ferrari","Fiat","Maserati","Lamborchini","Alfa","Linkolin"}
                                      };

        //1.Using For loop
        //outer loop--> we loop from 0 - cars.length
        //innner loop--> we loop from o -> cars[index].length
        for(int i=0; i<cars.length; i++){
            for(int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

        for(String[] carGroups: cars){
            for(String str: carGroups){
                System.out.print(str+ " ");
            }
        }

        System.out.println("----------------------------------");

        for(String[] carModels: cars){
            System.out.println(Arrays.toString(carModels));
        }

        System.out.println("----------------------------------------");

        System.out.println(Arrays.deepToString(cars));

        for(int i=0; i<cars.length; i++){
            switch(i){
                case 0:
                    System.out.println("Japaneese");
                    break;
                case 1:
                    System.out.println("German");
                    break;
                case 2:
                    System.out.println("Amarican");
                    break;
                case 3:
                    System.out.println("Italian");
                    break;
                default:
                    System.out.println("All models been printed");
                    for(int j=0; j<cars[i].length; j++){
                        System.out.print(cars[i][j]+" ");
                    }
            }
        }
    }
}
