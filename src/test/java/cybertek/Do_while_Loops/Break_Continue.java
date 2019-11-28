package cybertek.Do_while_Loops;

public class Break_Continue {

    //break --> break the loop
    // continue --> skip the curent num
    public static void main(String[] args) {


//    for(int i=0; i<10; i++){
//        if(i==5){
//            break;
//        }
//        System.out.println("Smart water"+i);      1,2,3,4,5 Break
//
//
//    }
//        for(int i=0; i<10; i++){
//            if(i==5){
//                continue;
//            }
//            System.out.println("Smart water"+i);   //1,2,3,4,,6,7,,8,9
//
//
//        }

        for(int i=1; i<50; i+=2){
            System.out.println("result Odd "+ i);

        }
        for(int i=0; i<50; i+=4){
            if(i%3==0 && i%5==0){
                continue;
            }
            System.out.println("result divisible by 4 "+ i);

        }
}}
