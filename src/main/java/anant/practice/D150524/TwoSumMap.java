package anant.practice.D150524;

import java.util.HashMap;
import java.util.Map;

public class TwoSumMap {
    public static void main(String[] args) {
        int [] nums = {3,4,2,8,4,7,9,6,5,4};
        int target=8;
        int remaining=0;
        boolean flag=false;
        Map<Integer,Integer> numsMap=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            remaining=target-nums[i];
            if(numsMap.containsKey(remaining)){
                System.out.println("indexs are: "+numsMap.get(remaining)+" "+i);
                flag=true;
            }else{
                numsMap.put(nums[i],i);
            }
        }
        if(!flag)
            System.out.println("No matching index has been found.");
    }
}
