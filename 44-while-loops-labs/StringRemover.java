//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

class StringRemover{
   private String remove;
   private String sentence;
   private String orisentence;

	public StringRemover( String sen, String rem ){
		sentence = sen;
		remove = rem;
		orisentence = sentence;
		removeStrings();
	}

	public void removeStrings(){
		while(sentence.indexOf(remove) != -1){
			int index = sentence.indexOf(remove);
			if(index == 0){
				sentence = sentence.substring(remove.length());
			}
			else{
				sentence = (sentence.substring(0, index-1)) + 
				(sentence.substring(index + remove.length(), sentence.length()));
			}
		}
	}

	public String toString(){
		return orisentence + " - String to remove " + remove + '\n' + sentence + '\n';
	}
}