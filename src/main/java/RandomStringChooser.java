import java.util.*;
public class RandomLetterChooser{
public RandomLetterChooser(String str)
    { 
    String[] newArray = RandomLetterChooser.getSingleLetter(str);
    super (newArray);
    }
public RandomStringChooser(String [] wordArray){
availability = new boolean[wordArray.length];
stringChooser = wordArray;
for(int i = 0; i < availability.length; i++)
availability[i]  = true;
}

public String getNext(){
int randomIndex = (int)(Math.random() * availability.length);
if(availability[randomIndex] == true){
availability[randomIndex] = false;
return stringChooser[randomIndex];
}
else {
return "NONE";
}
}
}
