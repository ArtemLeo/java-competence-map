package OOP.Enlite_OOP.OOP_06_StringBuilder_StringBuffer;

public class Main {
    public static void main(String[] args) {

        // StringBuffer is thread-safe, and all its methods are synchronized
        // StringBuilder is not thread-safe, and all its methods are non-synchronized
        // StringBuilder in Java works faster than StringBuffer

        StringBuilder builder = new StringBuilder();
        StringBuffer buffer = new StringBuffer();

        // StringBuilder
        builder.append("12345");
        builder.deleteCharAt(1);
        builder.setCharAt(0,'$');
        System.out.println(builder);
        System.out.println("----------------------------");

        // StringBuffer
        buffer.append("12345");
        buffer.deleteCharAt(1);
        buffer.setCharAt(0,'$');
        System.out.println(buffer);
    }
}
