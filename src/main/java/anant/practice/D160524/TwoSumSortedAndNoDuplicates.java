package anant.practice.D160524;

public class TwoSumSortedAndNoDuplicates {
    public static void main(String[] args) {
        //int []nums={-1,0,0,1,2,2,7};
        int[] nums = {-4, -1, -1, 0, 0, 1, 2, 2};
        //int target=1;
        int target=4;
        int i=0;
        int j=nums.length-1;
        int sum=0;
        while(i<j){
            sum=nums[i]+nums[j];
            if(sum>target){
                j--;
            }
            else if (sum<target) {
                i++;
            }
            else {
                if(nums[i]==nums[i+1]){
                    i++;
                    continue;
                } else if (nums[j]==nums[j-1]) {
                    j--;
                    continue;
                }
                System.out.println(i +" "+j);
                j--;
                i++;
            }
        }
    }
}
