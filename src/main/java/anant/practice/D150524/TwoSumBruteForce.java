package anant.practice.D150524;

public class TwoSumBruteForce {
    public static void main(String[] args) {
        int [] nums = {3,4,2,8,4,7,9,6,5,4};
        int target=8;
        int remaining=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            remaining= target-nums[i];
            for (int j=i+1;j<nums.length;j++){
                if(nums[j]==remaining){
                    System.out.println("Indexes are: "+i+" "+j);
                    flag=true;
                }
            }
        }
        if(!flag)
            System.out.println("No indexs found: ");
    }
}
