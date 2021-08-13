//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Fibonacci
{
	//instance variable
	private long[] dp = new long [1000000];
	private int limit;

	//constructors
	public Fibonacci(){
		dp[1] = 1;
		dp[2] = 1;
		for(int i = 3; i < 1000000; i++){
			dp[i] = (dp[i-1] + dp[i-2]);
		}
	}

	public int convert(String s){
		int n = 0;
		for(int i = s.length() - 1; i >= 0; i--){
			n *= 10;
			n += (s.charAt(i) - 48);
		}

		return n;
	}

	//set method
	public void setLimit(String s){
		limit = Integer.parseInt(s);
	}

	//get method
	public long getNum(String s){
		int index = Integer.parseInt(s);
		if(index > limit){
			return -1;
		}
		else{
			return dp[index];
		}
	}
}