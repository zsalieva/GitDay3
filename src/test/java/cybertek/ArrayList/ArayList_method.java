package cybertek.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArayList_method {


    public static void main(String[] args) {
       List<Integer> nums = new ArrayList<>();
       nums.add(23);
       nums.add(33);
       nums.add(43);
       nums.add(44);

        List<Integer> num2 = new ArrayList<>();
        nums.add(123);
        nums.add(313);
        nums.add(431);
        nums.add(441);
        int sumOfNUms =sum(nums);
        System.out.println(sumOfNUms);

      //  int sumOfNums2 =sum2(nums,num2);



       // System.out.println(sumOfNums2);

    }
        public static int sum(List<Integer> nums){
        int sum=0;
        for(int i=0; i<nums.size(); i++){
             sum+=nums.get(i);
        }

        return sum;
        }

    public static int sum2(List<Integer> num, List<Integer>nums1){
        int sum=0,sum2=0,result=0;

        for(int i=0; i<num.size(); i++){
            sum+=num.get(i);
        }
        for(int each: nums1){
            sum2+=each;
        }
        result=sum+sum2;
        return result;
    }
}
