package anant.practice.array;

import java.util.*;
import java.util.stream.Collectors;

//Find the duplicate number in an array containing n+1 integers where each integer is between 1 and n.Find the duplicate number in an array containing n+1 integers where each integer is between 1 and n.ind the duplicate number in an array containing n+1 integers where each integer is between 1 and n.
public class D230524 {
    public static void main(String[] args) {
        int [] array={3,4,5,6,3,9,5};
        Set<Integer> unique=new HashSet<>();
        for (int i=0;i<array.length;i++){
            if(unique.contains(array[i])){
                System.out.println("duplicate element is: "+array[i]);
            }else{
                unique.add(array[i]);
            }
        }

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Integer [] array2={3,4,5,6,3,9,5};
        List<Integer> arrayList= Arrays.asList(array2);
        Set<Integer> uniqueSet=new HashSet<>();
        System.out.println(arrayList.stream().filter(num -> uniqueSet.add(num)).findFirst().orElseThrow(()->new RuntimeException("No duplicate found")));
    }
}
