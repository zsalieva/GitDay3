package cybertek.Array_prac;

public class arrayCount {
    public static void main(String[] args) {


        double[] prices = {2.2, 3.4, 4.0, 6.4, 5.1,45.6,56.5,66.4,21.4};

        int count=0;
        for (int i = 0; i < prices.length; i++ ){

            if(prices[i]>20.0){
                count ++;


            }
        }

        if(count==0){
            System.out.println("No item cost more then 20$");
        }
        else{
            System.out.println( "The number of 20$ : "+ count);

        }



    }
}
