public class Problem2_WrapperToPrimitive {
    public static void main(String[] args) {
        Double dObject = 45.67;
        
        double dPrimitive = dObject;
        
        int iPrimitive = dObject.intValue();
        
        System.out.println("Double object: " + dObject);
        System.out.println("Primitive double: " + dPrimitive);
        System.out.println("Primitive int: " + iPrimitive);
    }
}