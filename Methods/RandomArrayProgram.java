import java.util.*;

class RandomArray {
    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = (int) (Math.random() * 9000) + 1000;
        return arr;
    }
    public double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int x : arr) { sum += x; if (x < min) min = x; if (x > max) max = x; }
        return new double[]{sum / (double) arr.length, min, max};
    }
}

public class RandomArrayProgram {
    public static void main(String[] args) {
        RandomArray ra = new RandomArray();
        int[] randoms = ra.generate4DigitRandomArray(5);
        System.out.println("Randoms: " + Arrays.toString(randoms));
        System.out.println("Avg/Min/Max: " + Arrays.toString(ra.findAverageMinMax(randoms)));
    }
}
