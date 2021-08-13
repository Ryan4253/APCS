//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
 
public class Triples
{
   private int number;

	public Triples(int num){
		number = num;
	}

	public int GCD(int a, int b){
		if(a % b == 0){
			return a;
		}
		return gcd(b, a % b);
	}

	public Boolean parity(int a, int b, int c){
		return ((a % 2 == 0) ^ (b % 2 == 0)) && c % 2 == 1; 
	}

	public Boolean right(int a, int b, int c){
		return ((a * a + b * b) == (c * c));
	}

	public void printTriples()
	{
		for(int i = 1; i <= number; i++){
			for(int j = i; j <= number; j++){
				for(int k = j; k <= number; k++){
					if(right(i, j, k) && parity(i, j, k) && GCD(GCD(i, j), k) == 1){
						System.out.println(i + " " + j + " " + k);
					}
				}
			}
		}
	}
}