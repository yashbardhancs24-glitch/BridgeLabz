import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ProblemP8_7_ProductRatings {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3, 5};
        
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, 4, null, 2, 4, null));
        
        ArrayList<Integer> combinedList = new ArrayList<>();
        
        for (int rating : oldRatings) {
            combinedList.add(rating);
        }
        
        combinedList.addAll(newRatings);
        
        System.out.println("Combined list with nulls: " + combinedList);
        
        int validSum = 0;
        int validCount = 0;
        
        for (Integer rating : combinedList) {
            if (Objects.nonNull(rating)) { 
                validSum += rating;
                validCount++;
            }
        }
        
        double averageRating = (double) validSum / validCount;
        
        System.out.println("Total valid ratings: " + validCount);
        System.out.println("Average Rating: " + averageRating);
    }
}