import java.util.*;
public RandomStringChooser{
private String[] stringChooser;
private boolean[] availability;

public RandomStringChooser(String [] wordArray){
availability = new boolean[wordArray.length];
stringChooser = wordArray;
for(int i = 0; i < availability.length; i++)
availability[i]  = true;
}

public String getNext(){
int randomIndex = (int)(Math.random() * availability.length)
if(availability[randomIndex] == true){
availability[randomIndex] = false;
return stringChooser[randomIndex];
}
else {
return "NONE";
}
}
}
