//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

    public Social(){
        socialNum = "0";
    }

    public Social(String soc){
        socialNum = soc;
    }

    public void chopAndAdd(){
        String[] temp = {"", "", ""}; // 3 sets of numbers
        int curr = 0;

        for(int i = 0; i < socialNum.length(); i++){
            if(socialNum.charAt(i) == '-'){
                sum += convert(temp[curr]);
                curr++;
            }
            else{
                temp[curr] += socialNum.charAt(i);
            }
        }
        sum += convert(temp[curr]);
    }

    public int convert(String s){
        int sol = 0;
        for(int i = 0; i < s.length(); i++){
            sol *= 10;
            sol += s.charAt(i)-48;
        }
        return sol;
    }

    public String toString(){
        return "SS# " + socialNum + " has a total of " + sum + "\n";
    }
}