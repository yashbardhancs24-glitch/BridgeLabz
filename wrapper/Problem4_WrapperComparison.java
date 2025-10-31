public class Problem4_WrapperComparison {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        
        System.out.println("a == b: " + (a == b));
        System.out.println("c == d: " + (c == d));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("c.equals(d): " + c.equals(d));
        
        System.out.println("\n--- Explanation ---");
        System.out.println("a == b is true because Java caches Integer objects for values between -128 and 127. Both 'a' and 'b' point to the *same* object in memory.");
        System.out.println("c == d is false because the value 200 is outside the cached range. 'c' and 'd' are two *different* objects in memory, even though they hold the same value.");
        System.out.println("a.equals(b) and c.equals(d) are both true because the .equals() method compares the actual *value* inside the objects, not their memory addresses.");
    }
}