
/**
 * Write a description of class Extra_Sorting_Lab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Arrays;


public class Extra_Sorting_Lab
{
    public static void main(String[] args) 
    {
        int[] array = {14,7,1,25,6,10,11,4,3,0,11};
        System.out.println ("Unsorted array");
        System.out.println ( Arrays.toString( array ) );        
        // Sort (in ascending order) the elements in the array  using loops.
        // If you are solving this problem is because you 
        // completed the bootcamp labs.
        // Please do not take shortcuts ... 
        //   Do not look at the web. 
        //   Do not copy code from a classmate
        //   Do not use Arrays.sort
        int n = array.length;
        int ptr = 0;
        int max = 0;
        int[] sorted = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(array[j] > max){
                    max = array[j];
                    ptr = j;
                }
            }
            sorted[i] = max;
            array[ptr] = 0;
            max = 0; ptr = 0;
        }
        
        
        System.out.println ("Sorted array");
        System.out.println (Arrays.toString(sorted));
        //print out the (resulting) sorted array
        
    }

}