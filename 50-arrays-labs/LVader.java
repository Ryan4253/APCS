import java.util.Arrays;

//make your LVader class here

public class LVader{
	private int [] floor;
	private int fcnt;

	public LVader(int n){
		floor = new int[n];
		fcnt = n;
	}

	public Boolean inRange(int n){
		return n <= fcnt;
	}

	public Boolean incNumStops(int index){
		if(inRange(index)){
			floor[index]++;
			return true;
		}
		else{
			return false;
		}
	}

	public int numStops(int index){
		if(inRange(index)){
			return floor[index];
		}
		else{
			return -1;
		}
	}

	public int floorWithMostStops(){
		int mxindex = 0;
		for(int i = 0; i < fcnt; i++){
			if(floor[mxindex] < floor[i]){
				mxindex = i;
			}
		}
		return mxindex;
	}

	public String toString(){
		return Arrays.toString(floor);
	}
}