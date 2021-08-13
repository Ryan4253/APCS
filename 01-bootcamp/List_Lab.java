import java.util.List;
import java.util.ArrayList;

public class List_Lab
{
	public static int sumList( List<Integer> list )
	{
	    int sum =0;
	    // add all the elements that are inside list.
        for(int i = 0; i < list.size(); i++){
        	sum += list.get(i);
        }
		return sum;
	}
	
	public static void main(String[] args) 
   {
		List<Integer> nums = new ArrayList<Integer>();
		double n = (int)(Math.random()*((10-5)+1))+5;
		for(int i = 0; i < n; i++){
		    double temp = Math.random()*((100)+1);
		    
		    nums.add((int)temp);
		}
		//add in some numbers to the list
		//use a loop and Math.random() if you feel froggy
		
   
   	System.out.println( sumList( nums ) );     
   }
}
