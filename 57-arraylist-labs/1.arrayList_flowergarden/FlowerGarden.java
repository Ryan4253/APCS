import java.util.Arrays;
import java.util.ArrayList;

public class FlowerGarden
{
	//create an arraylist instance variable
	private ArrayList<String> v;

	//write a constructor 		
	public FlowerGarden(){
		v = new ArrayList<String>();
	}

	//write add flower
	public void addFlower(String flower){
		for(int i = 0; i < v.size(); i++){
			String info = (v.get(i)).substring(3);
			if(flower.equals(info)){
				int cnt = Integer.parseInt(v.get(i).substring(0, 2))+1 % 100; // prevents overflow
				if(cnt < 10){
					v.add("0"+cnt+" "+info);
				}
				else{
					v.add(cnt + " " + info);
				}
				v.remove(i);
				return;
			}
		}

		v.add(("01 " + flower));
	}

	//write get count
	public int getCount(String flower){
		int index = findFlower(flower);

		if(index == -1){
			return 0;
		}
		else{
			return Integer.parseInt(v.get(index).substring(0, 2));
		}
	}	

	//write get flower name
	public String getFlowerName(int index){
		if(!inRange(index)){
			return "out of Range";
		}
		return (v.get(index)).substring(3);
	}

	//write in range
	public boolean inRange(int index){
		return v.size() > index;
	}

	//write find flower
	public int findFlower(String flower){
		for(int i = 0; i < v.size(); i++){
			String s = v.get(i);
			if((s.substring(3)).equals(flower)){
				return i;
			}
		}

		return -1;
	}

	//write max flower
	public String maxFlower(){
		int mx = 0;
		for(int i = 1; i < v.size(); i++){
			if(getCount(getFlowerName(i)) > getCount(getFlowerName(mx))){
				mx = i;
			}
		}

		return v.get(mx);
	}
	
	//write a toString
	public String toString(){
		return v.toString();
	}
}