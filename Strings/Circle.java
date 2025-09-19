public class Circle {
    // Attribute
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return area
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    // Method to calculate and return circumference
    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    // Method to display results
    public void displayCalculations() {
        System.out.println("Circle Radius: " + this.radius);
        System.out.printf("Area: %.2f\n", calculateArea());
        System.out.printf("Circumference: %.2f\n", calculateCircumference());
    }

    // Main method to test the class
    public static void main(String[] args) {
        Circle myCircle = new Circle(7.5);
        myCircle.displayCalculations();
    }
}