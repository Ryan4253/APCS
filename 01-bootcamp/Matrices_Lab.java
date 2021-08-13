import java.util.Scanner;
import java.util.Arrays;

public class Matrices_Lab
{
	public static int sumMat( int[][] matty )
	{
	    int sum = 0;
	    for(int i = 0; i < matty.length; i++){
	    	for(int j = 0; j < matty[i].length; j++){
	    		sum += matty[i][j];
	    	}
	    }
        
		return sum;
	}
	
   public static void main(String[] args) 
   {
       int[][] mat = {{2,3,4},
                      {55,66,77},
                      {22,11}};
       
       System.out.println( sumMat( mat ) );       
   }
}
