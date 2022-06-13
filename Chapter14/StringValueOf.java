public class StringValueOf {
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean booleanValue = true;
        char characterValue = 'z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.33;
        Object objectRef = "hello";

        System.out.printf("char array = %s%n", String.valueOf(charArray));
        System.out.printf("part of char array = %s%n", String.valueOf(charArray, 3, 3));
        System.out.printf("boolean value = %s%n", String.valueOf(booleanValue));
        System.out.printf("character value = %s%n", String.valueOf(characterValue));
        System.out.printf("integer value = %s%n", String.valueOf(integerValue));
        System.out.printf("long value = %s%n", String.valueOf(longValue));
        System.out.printf("float value = %s%n", String.valueOf(floatValue));
        System.out.printf("double value = %s%n", String.valueOf(doubleValue));
        System.out.printf("object reference = %s%n", String.valueOf(objectRef));
    }
}
