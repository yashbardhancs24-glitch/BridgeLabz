import java.util.ArrayList;

public class Problem3_AutoBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(9); 
        
        int sum = 0;
        
        for (Integer num : list) {
            sum += num;
        }
        
        System.out.println("Sum of numbers = " + sum);
    }
}