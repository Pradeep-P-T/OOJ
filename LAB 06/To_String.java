public class To_String {
    private String name;
    private int age;

    // Constructor
    public To_String(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString() method
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    public static void main(String[] args) {
        // Creating a Person object
        To_String person = new To_String("John Doe", 25);

        // Using toString() to get a string representation
        String personString = person.toString();

        // Printing the string representation
        System.out.println(personString);
    }
}
