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

	public static void lengthSort( ArrayList<String> list )
	{
		for(int i = 0; i < list.size()-1; i++){
			int index = i;
			for(int j = i+1; j < list.size(); j++){
				if(cmp(list.get(index), list.get(j))){
					index = j;
				}
			}
			String temp = list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}		
		arraylist = list;		
	}

	public String toString(){
		return arraylist.toString();
	}
}