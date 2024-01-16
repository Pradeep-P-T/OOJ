abstract class Bird {
    // Abstract method for flying
    public abstract void fly();

    // Abstract method for making a sound
    public abstract void makeSound();
}

class Eagle extends Bird {
    // Implementing fly() method for Eagle
    @Override
    public void fly() {
        System.out.println("Eagle is soaring high in the sky.");
    }

    // Implementing makeSound() method for Eagle
    @Override
    public void makeSound() {
        System.out.println("Eagle screeches loudly.");
    }
}

class Hawk extends Bird {
    // Implementing fly() method for Hawk
    @Override
    public void fly() {
        System.out.println("Hawk is gliding gracefully through the air.");
    }

    // Implementing makeSound() method for Hawk
    @Override
    public void makeSound() {
        System.out.println("Hawk makes a sharp cry.");
    }
}

public class BirdDemo {
    public static void main(String[] args) {
        // Creating instances of Eagle and Hawk
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

        // Calling fly() and makeSound() methods for Eagle
        System.out.println("Eagle Actions:");
        eagle.fly();
        eagle.makeSound();
        System.out.println();

        // Calling fly() and makeSound() methods for Hawk
        System.out.println("Hawk Actions:");
        hawk.fly();
        hawk.makeSound();
    }
}
