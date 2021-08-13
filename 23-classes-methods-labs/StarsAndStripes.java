//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ryan Liao

import static java.lang.System.*;

public class StarsAndStripes{
   	public StarsAndStripes(){
      	System.out.println("StarsAndStripes");
      	printTwoBlankLines();
  	}

   	public void printTwentyStars(){
   		System.out.println("********************");
   		return;
   	}

   	public void printTwentyDashes(){
   		System.out.println("--------------------");
   		return;
   	}

 	public void printTwoBlankLines(){
   		System.out.print("\n\n");
   		return;
   	}
   
 	public void printASmallBox(){	
   		for(int i = 0; i < 3; i++){
   			printTwentyDashes();
   			printTwentyStars();
   			}
   		printTwentyDashes();
   		return;
   	}
 
	public void printABigBox(){ 
 		printASmallBox();
   		printASmallBox();
   	}   
}