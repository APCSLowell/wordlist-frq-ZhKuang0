import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int num = 0;
    for (String blank: this.myList)
      if (blank.length() == len)
    num++;
    return num;
  }

  public void removeWordsOfLength(int len)
  {
    for (int i = 0; i < this.myList.size()-1; i++) {
      if (this.myList.get(i).length() == len) {
      this.myList.remove(i);
        i--;
      }
    }
  }
}
