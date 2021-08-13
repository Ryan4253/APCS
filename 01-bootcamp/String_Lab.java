import java.util.Scanner;

public class String_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter a word :: ");
        String word = kb.next();
        
        //print out the first and last letter of the word
        System.out.print(word.charAt(0) + " ");
        System.out.print(word.charAt(word.length() - 1));
        System.out.print("\n");
        
        //print out the word backwords
        for(int i = word.length() - 1; i >= 0; i--){
        	System.out.print(word.charAt(i));
        }
        System.out.print("\n");
        
        
        //check to see if the word contains a vowel
       boolean flag = false;
       int[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

      	for(int i = 0; i < word.length(); i++){
      		for(int j = 0; j < 10; j++){
      			if(word.charAt(i) == vowel[j]){
      				flag = true;
      			}
      		}
      	}

      	if(flag){
      		System.out.println("It Contains A Vowel");
      	}
      	else{
      		System.out.println("It Does Not Contain A Vowel");
      	}
    }
}
