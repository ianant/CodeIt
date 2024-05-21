package anant.practice.D170524;

import java.util.ArrayList;
import java.util.List;

public class SortedThreeSumWithNoDuplicates {
    public static void main(String[] args) {
        int[] array = {-4, -1, -1, 0, 0, 1, 2, 2};
        int length=array.length;
        if(length<3){
            System.out.println("Less than 3 elements");
            System.exit(0);
        }
        int target = 0;

        //fixing 1 element n1
        for (int i=0;i<length-2;i++){
            if(array[i]==array[i+1]){
                continue;
            }
            int n1=array[i];
            int targetForTwoSum=target-n1;
            List<List<Integer>> elements=twoSumSorted(array,targetForTwoSum,i+1,length-1);
            System.out.println(elements);
        }

    }

    public static List<List<Integer>> twoSumSorted(int[] array, int n1, int j, int k) {
        List<List<Integer>> returnValue=new ArrayList<>();
        List<Integer> valueFound=new ArrayList<>();
        int sum = 0;
        while (j < k) {
            sum = array[j] + array[k];
            if (sum > n1) {
                k--;
            } else if (sum < n1) {
                j++;
            } else {
                if (array[j] == array[j + 1]) {
                    j++;
                    continue;
                }

                if (array[k] == array[k - 1]) {
                    k--;
                    continue;
                }
                j++;
                k--;
                valueFound.add(j);
                valueFound.add(k);
                returnValue.add(valueFound);
            }
        }
        return returnValue;
    }
}