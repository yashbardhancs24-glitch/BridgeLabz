import java.util.*;

class Friends {
    public static String youngest(String[] names, int[] ages) {
        int minIdx = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[minIdx]) minIdx = i;
        return names[minIdx];
    }
    public static String tallest(String[] names, int[] heights) {
        int maxIdx = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[maxIdx]) maxIdx = i;
        return names[maxIdx];
    }
}

public class FriendsProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3], heights = new int[3];
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }
        System.out.println("Youngest: " + Friends.youngest(names, ages));
        System.out.println("Tallest: " + Friends.tallest(names, heights));
    }
}
