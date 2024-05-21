package anant.practice.array;

//Find the missing number in an array of size n containing numbers from 1 to n+1.
public class D210524 {

    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,8,9};
        int n=array.length;
        int actualSum=(n+1)*(n+2)/2;
        int arraySum=0;
        for (int i=0;i<array.length;i++){
            arraySum=arraySum+array[i];
        }
        int missingNumber=actualSum-arraySum;
        System.out.println(missingNumber);
    }

}
