import java.util.*;
public class RandomStringChooser {
    private String[] availableStrings;
    private int nextIndex;

    // Constructor
    public RandomStringChooser(String[] wordArray) {
        availableStrings = new String[wordArray.length];
        for (int i = 0; i < availableStrings.length; i++) {
            availableStrings[i] = wordArray[i];
        }
        nextIndex = 0;
    }

    // Method to get the next random string
    public String getNext() {
        if (nextIndex >= availableStrings.length) {
            return "NONE";
        } else {
            int randomIndex = (int) (Math.random() * (availableStrings.length - nextIndex)) + nextIndex;
            String chosenString = availableStrings[randomIndex];
            availableStrings[randomIndex] = availableStrings[nextIndex];
            availableStrings[nextIndex] = chosenString;
            nextIndex++;
            return chosenString;
        }
    }
}
