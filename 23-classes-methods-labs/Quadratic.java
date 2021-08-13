//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ryan Liao

public class Quadratic
{
	public static double getRootOne( int _a, int _b, int _c)
	{
		double a = _a;
		double b = _b;
		double c = _c;
		double sol = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.print("rootone:: ");
		return sol;
	}
	
	public static double getRootTwo( int _a, int _b, int _c)
	{
		double a = _a;
		double b = _b;
		double c = _c;
		double sol = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.print("roottwo:: ");
		
		return sol;
	}
}