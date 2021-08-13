//© A+ Computer Science  -  www.apluscompsci.com
//Name - Ryan Liao
//Date - 9/7/2020
//Class - AP Computer Science B4
//Lab  - AsciiBox2

public class AsciiBox2
{
	public static void main(String[] args)
	{
		System.out.println("Name: \t Ryan Liao \nDate: \t 9/7/2020");
		System.out.println("+++++++++++++++++++++++++ " );
		for(int i = 0; i < 15; i++){
			if(i == 0 || i == 14){
				System.out.println("000000000000000");
			}
			else if(i == 7){
				System.out.println("0   Compsci   0");
			}
			else{
				System.out.println("0             0");
			}
		}
		System.out.print("\n");
	}
}