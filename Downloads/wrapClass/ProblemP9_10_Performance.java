import java.util.ArrayList;

public class ProblemP9_10_Performance {
    public static void main(String[] args) {
        int size = 1_000_000;

        System.out.println("Testing primitive int[]...");
        int[] primitiveArray = new int[size];
        for (int i = 0; i < size; i++) {
            primitiveArray[i] = i;
        }
        
        long startTime1 = System.nanoTime();
        long sum1 = 0;
        for (int i = 0; i < size; i++) {
            sum1 += primitiveArray[i];
        }
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1) / 1_000_000;
        
        System.out.println("Primitive int[] sum: " + sum1);
        System.out.println("Time taken: " + duration1 + " ms");

        
        System.out.println("\nTesting ArrayList<Integer>...");
        ArrayList<Integer> wrapperList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            wrapperList.add(i);
        }
        
        long startTime2 = System.nanoTime();
        long sum2 = 0;
        for (int i = 0; i < size; i++) {
            sum2 += wrapperList.get(i);
        }
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime1) / 1_000_000;
        
        System.out.println("ArrayList<Integer> sum: " + sum2);
        System.out.println("Time taken: " + duration2 + " ms");
        
        System.out.println("\nConclusion: The primitive array (int[]) is significantly faster due to no overhead from boxing, unboxing, and object memory management.");
    }
}