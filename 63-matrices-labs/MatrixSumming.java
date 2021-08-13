import java.util.*;
import java.io.*; 

public class MatrixSumming
{
    private int[][] m = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 0}, {6, 7, 1, 2, 5}, {6, 7, 8, 9, 0}, {5, 4, 3, 2, 1}};   //load in the matrix values
    private int[][] a = new int[m.length+2][m[0].length+2];

    public MatrixSumming(){
    	// build a matrix which surrounds a 0 around the original matrix, so summing won't cause
    	// index out of bound on sides / corners. Uses zero as it won't affect sum
    	for(int i = 0; i <= m.length+1; i++){
    		if(i != 0 && i != m.length+1){
    			for(int j = 1; j <= m[i-1].length; j++){
    				a[i][j] = m[i-1][j-1];
    			}
    		}
    	}
    }

    public int sum( int r, int c )
    {
    	r++; c++; // converts coordinates in the m matrix to the modified matrix

    	// dx / dy of all coordinates for all cells surrounding r & c, so I can use a for loop to iterate 
    	int[] dx = {-1, -1, -1, 0, 0, 0, 1, 1, 1}; // very big brain
    	int[] dy = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
		int sol = 0;

    	for(int i = 0; i < 9; i++){
    		sol += a[r+dx[i]][c+dy[i]];
    	}

    	return sol;
    }

    public String toString()
    {
    	String s = "Matrix Values" + '\n';
    	for(int i = 0; i < m.length; i++){
    		for(int j = 0; j < m[i].length; j++){
    			s += m[i][j] + " ";
    		}
    		s += '\n';
    	}

    	return s;
    }
}
