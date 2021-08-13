//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleWord
{
    private String word;
    private String a;
    public TriangleWord(String w)
    {
        word = w;

    }

    
    public void makeTriangle(){
        String space = "                                                   ";
        for(int i = 0; i < word.length()-1; i++){
           if(i == 0){
                System.out.print(space.substring(0, (word.length() - 1)));
                System.out.print(word.charAt(0));
                System.out.println(space.substring(0, (word.length() - 1)));
            }
            else{
                System.out.print(space.substring(0, word.length() - i - 1));
                System.out.print(word.charAt(i));
                System.out.print(space.substring(0, i * 2 - 1));
                System.out.print(word.charAt(i));
                System.out.print(space.substring(0, word.length() - i - 1));
                System.out.println();
            }
        }
        
        for(int i = word.length()-1; i > 0; i--){
            System.out.print(word.charAt(i));
        }
        
        System.out.println(word);
    }

    public String toString()
    {
        makeTriangle();
        return "";
    }
}