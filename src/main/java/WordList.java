import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int length)
{
    int numWords = 0;

    for(int i = 0; i < myList.size(); i++)
    {
        String word = (String) myList.get(i);
        
        if(word.length() == length)
            numWords++;
    }

    return numWords;
}

  public void removeWordsOfLength(int length)
{
    int i = 0;

    while(i < myList.size())
    {
        String word = (String) myList.get(i);
        
        if(word.length() == length)
            myList.remove(i);
        else
            i++;
    }
}
}
