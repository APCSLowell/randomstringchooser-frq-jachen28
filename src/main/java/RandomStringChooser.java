import java.util.*;

public class RandomStringChooser {
    private ArrayList<String> availableStrings;

    public RandomStringChooser(String[] wordArray) {
        availableStrings = new ArrayList<>();
        for (int i = 0; i < wordArray.length; i++) {
            availableStrings.add(wordArray[i]);
        }
    }

    public String getNext() {
        if (availableStrings == 0) {
            return "NONE";
        }
        int randomIndex = (int)(Math.random() * availableStrings.size());
        return available.remove(randomIndex);
    }
}
