package anoud;

import java.util.Arrays; 
import java.util.Collections; 
  
public class ArraySort 
{ 
    public static void main(String[] args) 
    { 
        Integer[] arr = {5, 1, 8, 0, 9, 4}; 
        Integer[] arr1 = {5, 1, 8, 0, 9, 4};
        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr1);
        System.out.println("Descending Order :"+ Arrays.toString(arr)); 
        System.out.println("Ascending Order :"+Arrays.toString(arr1));
}
}