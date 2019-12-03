package cybertek.Methods;

public class WeekDay {
    public static void main(String[] args) {
        System.out.println(workDay("Saturday"));

    }
    public static boolean workDay(String str){
        switch(str){
            case "Monday":
                System.out.println("Valid day");
                break;
            case "Tuesday":
                System.out.println("Valid day");
                break;
            case "Wednesday":
                System.out.println("Valid day");
                break;
            case "Thursday":
                System.out.println("Valid day");
                break;
            case "Friday":
                System.out.println("Valid day");
                break;
            case "Saturday":
                System.out.println("Valid day");
                break;
            case "Sunday":
                System.out.println("Valid day");
                break;

        }
        boolean b = true;
        if(str.equals("Monday")||str.equals("Tuesday")||str.equals("Wednesday")||str.equals("Thursday")||str.equals("Friday")
                ||str.equals("Sunday")||str.equals("Monday")|| str.equals("Saturday")){
            return b;
        }else {
            System.out.println("Not valid");
        return false;}


    }
}
