//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle(){
	}

	public PascalsTriangle(int size){
		mat = new int[size][size];
	}

	public void createTriangle(){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j <= i; j++){
				if(j == 0){
					mat[i][j] = 1;
				}
				else{
					mat[i][j] = mat[i-1][j] + mat[i-1][j-1];
				}
			}
		}
	}

	public String toString(){
		// just use substring for number of space
		String space = "                                                                              ";

		String output="";

		for(int i = 0; i < mat.length; i++){
			output += space.substring(0, (mat.length-i-1) * 2);
			for(int j = 0; j <= i; j++){
				if(mat[i][j] >= 100){
					output += mat[i][j]+ " ";
				}
				else if(mat[i][j] >= 10){
					output += mat[i][j]+ "  ";
				}
				else{
					output += mat[i][j]+ "   ";
				}
				
			}
			output += '\n';
		}

		return output;
	}
}