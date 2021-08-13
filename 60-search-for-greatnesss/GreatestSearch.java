
/**
 * Write a description of class GreatestSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
public class GreatestSearch
{
    
    // Create instance variable to store teams
   	private ArrayList<String> teams;
    
    // Create constructor (populate it with the list of Premier League teams (2020-2021) in alphabetical order)
    // https://en.wikipedia.org/wiki/2020–21_Premier_League

    public GreatestSearch(){
    	teams = new ArrayList<String>();

    	String [] tm = {"Arsenal", "Aston Villa", "Brighton & Hove Albion", 
		"Burnley", "Chelsea", "Crystal Palace", "Everton", "Fulham", "Leeds United", "Leicester City", "Liverpool",
		"Manchester City", "Manchester United", "Newcastle United", "Sheffield United", "Southampton",
		"Tottenham Hotspur", "West Bromwich Albion", "West Ham United", "Wolverhampton Wanderers", };

		for(int i = 0; i < 20; i++){
			teams.add(tm[i]);
		}
    }
    
    // Linear Search Method (receives a team Name) and returns location.
    int linearSearch(String target){
    	int index = -1;

		for(int i = 0; i < teams.size(); i++){
			if(teams.get(i).equals(target)){
				index = i;
			}
		}

		return index;
    }
    
    // Binary Search Method (receives a team Name) and returns location.
    int binarySearch(String target){
    	int l = 0, r = teams.size();

		while(l + 1 != r){
			int mid = (l + r) / 2;
			if(target.compareTo(teams.get(mid)) >= 0){
				l = mid;
			}
			else{
				r = mid;
			}
		}

		int index = (teams.get(l).equals(target) ? l : -1);
		return index;
    }
    
    // toString method returns a String with the arraylist of teams
    public String toString(){
    	return teams.toString();
    }
}
