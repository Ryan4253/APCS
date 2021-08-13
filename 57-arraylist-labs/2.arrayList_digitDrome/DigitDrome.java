import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Integer;

public class DigitDrome
{
	//create an arraylist instance variable
	private ArrayList<Integer> v;

	//write a constructor 	
	public DigitDrome(){
		v = new ArrayList<Integer>();
	}	
	
	//write create group
	public void createGroup(ArrayList<Integer> data){
		for(int i = 0; i < data.size(); i++){
			int n = data.get(i);
			if(n < 10){
				v.add(n);
			}
			else{
				v.add(getLeft(n) + getRight(n));
			}
		}
	}

	//write get left
	public int getLeft(int n){
		while(n >= 10){
			n /= 10;
		}

		return n;
	}	

	//write get right
	public int getRight(int n){
		return n % 10;
	}

	//write isPalin	
	public boolean isPalin(){
		boolean flag = true;

		for(int i = 0; i < v.size()/2; i++){
			if(v.get(i) != v.get(v.size()-i-1)){
				flag = false;
			}
		}

		return flag;
	}
	
	//write a toString	
	public String toString(){
		return v.toString();
	}	
}