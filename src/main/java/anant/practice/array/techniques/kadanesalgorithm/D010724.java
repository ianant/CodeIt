package anant.practice.array.techniques.kadanesalgorithm;
/*
Largest Sum Contiguous Subarray (Kadane’s Algorithm)
 */
public class D010724 {
    public static void main(String[] args) {
        int [] array={-2,-3,4,-1,-2,1,5,-3};
        int max_sum=0;
        int current_sum=0;
        for(int i=0;i<array.length;i++){
            if(current_sum < 0){
                current_sum=0;
            }
            current_sum=array[i]+current_sum;
            if(current_sum>max_sum){
                max_sum=current_sum;
            }
        }
        System.out.println("Current sum of contigious array is: "+max_sum);

    }
}
