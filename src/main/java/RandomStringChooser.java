import java.util.*;
public class RandomStringChooser {
    private String[] stringChooser;
    private String[] availability;

    public RandomStringChooser(String[] wordArray) {
        availability = new String[wordArray.length];
        stringChooser = wordArray;
        for (int i = 0; i < availability.length; i++) {
            availability[i] = "available";
        }
    }

    public String getNext() {
        int randomIndex = (int) (Math.random() * availability.length);
        if (availability[randomIndex].equals("available")) {
            availability[randomIndex] = "used"; // Mark the string as used
            return stringChooser[randomIndex];
        } else {
            return "None";
        }
    }
}
