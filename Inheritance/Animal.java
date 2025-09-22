// Superclass
class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass 1
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age); // Call the superclass constructor
    }

    @Override // Annotation to indicate method overriding
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow!");
    }
}

// Subclass 3
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps: Tweet!");
    }
}

// Main class to demonstrate
public class AnimalDemo {
    public static void main(String[] args) {
        // Polymorphism: Using a superclass reference for subclass objects
        Animal myDog = new Dog("Buddy", 3);
        Animal myCat = new Cat("Whiskers", 5);
        Animal myBird = new Bird("Polly", 2);

        myDog.makeSound(); // Calls Dog's makeSound()
        myCat.makeSound(); // Calls Cat's makeSound()
        myBird.makeSound(); // Calls Bird's makeSound()
    }
}