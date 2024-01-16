abstract class Bird {
    public abstract void fly();
    public abstract void makeSound();
}

class Eagle extends Bird {
    public void fly() {
        System.out.println("Eagle is soaring high in the sky.");
    }
    public void makeSound() {
        System.out.println("Eagle screeches loudly.");
    }
}

class Hawk extends Bird {
    public void fly() {
        System.out.println("Hawk is gliding gracefully through the air.");
    }
    public void makeSound() {
        System.out.println("Hawk makes a sharp cry.");
    }
}

public class BirdDemo {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();
        System.out.println("Eagle Actions:");
        eagle.fly();
        eagle.makeSound();
        System.out.println();
        System.out.println("Hawk Actions:");
        hawk.fly();
        hawk.makeSound();
    }
}
