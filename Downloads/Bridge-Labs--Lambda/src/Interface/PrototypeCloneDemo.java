package Interface;

class PrototypeModel implements Cloneable {
    String model = "Prototype-X";

    public PrototypeModel clone() throws CloneNotSupportedException {
        return (PrototypeModel) super.clone();
    }
}

public class PrototypeCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeModel p1 = new PrototypeModel();
        PrototypeModel p2 = p1.clone();
        System.out.println("Cloned Model: " + p2.model);
    }
}
