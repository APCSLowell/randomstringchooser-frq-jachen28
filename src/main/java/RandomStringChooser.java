import java.util.*;
public RandomStringChooser{
private String[] stringChooser;
private String[] availability;

public RandomStringChooser(String [] wordArray){
availability = new String[wordArray.length];
stringChooser = wordArray;
for(int i = 0; i < availability.length; i++)
availability  = "available";
}

public String getNext(){
int randomIndex = (int)(Math.random() * availability.length)
if(availability[randomIndex].equals("available"){
availability[randomIndex] = "false";
return stringChooser[randomIndex];
else {
return "None";
}
}
}
