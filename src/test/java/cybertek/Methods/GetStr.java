package cybertek.Methods;

public class GetStr {

    public static void main(String[] args) {
        System.out.println(getStars(6));
        int[]nums ={1,2,4,5,7,8,9,7,5,4,2,1};
        for(int n: nums){
            System.out.println(getStars(n));
        }
    }
    public static String getStars(int count){

        String stars="";
        for(int i=1; i<=count; i++){
            stars=stars+"*"+" ";
        }
        return stars;
    }
}
