//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class WordFun
{
	private String word;
	
	public WordFun(String w){
		word = w;
	}

	public void makeUpper(){
		System.out.println(word.toUpperCase());
	}

	public void addHyphen()
	{
		String sol = "";

		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == ' '){
				sol += "-";
			}
			else if(word.charAt(i) >= 'a'){
				sol += (char)(word.charAt(i) - 32);
			}
			else{
				sol += word.charAt(i);
			}
		}

		System.out.println(sol);
	}

	public void getWord(){
		System.out.println(word);
	}

	public String toString()
	{
		return "";
	}
}