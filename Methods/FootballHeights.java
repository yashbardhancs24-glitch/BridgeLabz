import java.util.Random;

public class FootballHeights {

    // Method to generate random heights
    public static int[] generateHeights() {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150–250
        }
        return heights;
    }

    // Method to calculate sum
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    // Method to calculate mean
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find shortest
    public static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    // Method to find tallest
    public static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    // Display all results
    public static void main(String[] args) {
        int[] heights = generateHeights();

        System.out.println("Players Heights:");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\n-------------------");

        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}
