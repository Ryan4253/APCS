//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals){
		grid = new String[cols][rows];
		for(int i = 0; i < cols; i++){
			for(int j = 0; j < rows; j++){
				int n = (int)(Math.random() * vals.length);
				grid[i][j] = vals[n];
			}
		}
	}

	//find out which of the vals occurs the most

	public String findMax(String[] vals){
		int mxcnt = 0; String mx = "", sol = "";

		// this code is so slow
		for(int i = 0; i < vals.length; i++){
			sol += (vals[i] + " count is " + countVals(vals[i]) + '\n');
			if(countVals(vals[i]) >= mxcnt){
				mx = vals[i];
				mxcnt = countVals(vals[i]);
			}
		}

		return sol + '\n' + mx + " occurs the most.";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals(String val){
		int cnt = 0;
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				if(grid[i][j].equals(val)){
					cnt++;
				}
			}
		}

		return cnt;
	}

	//display the grid
	public String toString(){
		String output="";
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[i].length; j++){
				output += (grid[i][j] + " ");
			}
			output += "\n";
		}
		return output;
	}
}