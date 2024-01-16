public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");

        // setLength() - Truncating the string
        stringBuffer.setLength(5);
        System.out.println("After setLength(5): " + stringBuffer);

        // charAt() - Accessing a character at a specific index
        char charAtIndex = stringBuffer.charAt(0);
        System.out.println("Character at index 0: " + charAtIndex);

        // setCharAt() - Modifying a character at a specific index
        stringBuffer.setCharAt(0, 'X');
        System.out.println("After setCharAt(0, 'X'): " + stringBuffer);

        // getChars() - Copying characters to a char array
        char[] charArray = new char[5];
        stringBuffer.getChars(0, 5, charArray, 0);
        System.out.print("getChars(0, 5): ");
        System.out.println(charArray);
    }
}
