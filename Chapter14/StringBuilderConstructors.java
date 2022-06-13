public class StringBuilderConstructors {
    public static void main(String[] args) {
        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer2 = new StringBuilder(10);
        StringBuilder buffer3 = new StringBuilder("hello");
        StringBuilder buffer = new StringBuilder("Hello, how are you?");

        System.out.printf("buffer1 = \"%s\"%n", buffer1);
        System.out.printf("buffer2 = \"%s\"%n", buffer2);
        System.out.printf("buffer3 = \"%s\"%n", buffer3);
        System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n", buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.printf("New capacity = %d%n%n", buffer.capacity());

        buffer.setLength(10);
        System.out.printf("New length = %d%nbuffer = %s%n", buffer.length(), buffer.toString());
    }
}
