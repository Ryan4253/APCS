//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;


	}

	public RomanNumeral(Integer orig)
	{
		
		number = orig;
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public int value(char c){
		if(c == 'M'){
			return 1000;
		}
		else if(c == 'D'){
			return 500;
		}
		else if(c == 'C'){
			return 100;
		}
		else if(c == 'L'){
			return 50;
		}
		else if(c == 'X'){
			return 10;
		}
		else if(c == 'V'){
			return 5;
		}
		else{
			return 1;
		}
	}

	public Integer getNumber()
	{
		int sol = 0;
		for(int i = 0; i < roman.length(); i++){
			int curr = value(roman.charAt(i));

			if(i + 1 < roman.length() && value(roman.charAt(i+1)) > curr){
				sol += value(roman.charAt(i+1))-curr;
				i++;
			}
			else{
				sol += curr;
			}
		}
		return sol;
	}

	public String toString()
	{
		String sol = "";
		for(int i = 0; i < 13; i++){
			while(number >= NUMBERS[i]){
				sol += LETTERS[i];
				number -= NUMBERS[i];
			}
		}
		return sol + '\n';
	}
}