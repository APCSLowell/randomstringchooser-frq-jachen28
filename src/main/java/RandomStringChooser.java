import java.util.*;
public class RandomStringChooser
{
  private String[] availableStrings;
  private int nextIndex;
  
  public void RandomStringChooser(String[] wordArray){
    availableStrings = new String[wordArray.length];
    for(int i = 0; i < availableStrings.length; i++){
      availableStrings[i] = wordArray[i];
    }
    nextIndex = 0;
  }

  public String getNext(){
  
  }
}
