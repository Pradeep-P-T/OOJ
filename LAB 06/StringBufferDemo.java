public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");
        stringBuffer.setLength(5);
        System.out.println("After setLength(5): " + stringBuffer);
        char charAtIndex = stringBuffer.charAt(0);
        System.out.println("Character at index 0: " + charAtIndex);
        stringBuffer.setCharAt(0, 'X');
        System.out.println("After setCharAt(0, 'X'): " + stringBuffer);
        char[] charArray = new char[5];
        stringBuffer.getChars(0, 5, charArray, 0);
        System.out.print("getChars(0, 5): ");
        System.out.println(charArray);
    }
}
