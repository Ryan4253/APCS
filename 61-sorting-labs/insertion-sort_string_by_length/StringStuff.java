import java.util.Arrays;
import java.util.ArrayList;

public class StringStuff
{
	private static ArrayList<String> arraylist = new ArrayList<String>();

	public static boolean cmp(String a, String b){
		// true = first one larger, else second
		if(a.length() == b.length()){
			return a.compareTo(b) >= 0;
		}
		return a.length() > b.length();
	}

	public static void lengthSort( ArrayList<String> list ){
		for(int i = 1; i < list.size(); i++){
			int j = i-1;
			String original = list.get(i);
			while(j >= 0 && cmp(list.get(j), original)){
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, original);
		}
		arraylist = list;
	}

	public String toString(){
		return arraylist.toString();
	}
}