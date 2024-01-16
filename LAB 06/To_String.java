public class To_String {
    private String name;
    private int age;
    public To_String(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }

    public static void main(String[] args) {
        To_String person = new To_String("John Doe", 25);
        String personString = person.toString();
        System.out.println(personString);
    }
}
