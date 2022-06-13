public class StringBuilderChars {
    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("hello there");

        System.out.printf("buffer = %s%n", buffer.toString());
        System.out.printf("Character at 0: %s%nCharacter at 4: %s%n%n", buffer.charAt(0), buffer.charAt(4));

        char[] charArray = new char[buffer.length()];
        buffer.getChars(0, buffer.length(), charArray, 0);
        System.out.print("The characters are: ");
        for (char character : charArray)
            System.out.print(character);

        buffer.setCharAt(0, 'H');
        buffer.setCharAt(6, 'T');
        System.out.printf("%n%nbuffer = %s", buffer.toString());

        buffer.reverse();
        System.out.printf("%n%nbuffer = %s%n", buffer.toString());

        Object objectRef = "hello";
        String string = "goodbye";
        char[] charAray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        boolean booleanValue = true;
        char characterValue = 'Z';
        int integerValue = 7;
        long longValue = 10000000000L;
        float floatValue = 2.5f;
        double doubleValue = 33.333;
        StringBuilder lastBuffer = new StringBuilder("last bufer");
        StringBuilder bufer = new StringBuilder();
        bufer.append(objectRef)
                .append("%n")
                .append(string)
                .append("%n")
                .append(charArray)
                .append("%n")
                .append(charAray, 0, 3)
                .append("%n")
                .append(booleanValue)
                .append("%n")
                .append(characterValue)
                .append("%n")
                .append(integerValue)
                .append("%n")
                .append(longValue)
                .append("%n")
                .append(floatValue)
                .append("%n")
                .append(doubleValue)
                .append("%n")
                .append(lastBuffer);
        System.out.printf("bufer contains%n%s%n", bufer.toString());

        bufer.insert(0, objectRef); 
        bufer.insert(0, " "); // each of these contains two spaces
        bufer.insert(0, string); 
        bufer.insert(0, " "); 
        bufer.insert(0, charAray); 
        bufer.insert(0, " "); 
        bufer.insert(0, charAray, 3, 3);
        bufer.insert(0, " "); 
        bufer.insert(0, booleanValue); 
        bufer.insert(0, " "); 
        bufer.insert(0, characterValue); 
        bufer.insert(0, " "); 
        bufer.insert(0, integerValue); 
        bufer.insert(0, " "); 
        bufer.insert(0, longValue); 
        bufer.insert(0, " "); 
        bufer.insert(0, floatValue); 
        bufer.insert(0, " "); 
        bufer.insert(0, doubleValue); 

        System.out.printf("buffer after inserts:%n%s%n%n", bufer.toString());

        bufer.deleteCharAt(10); // delete 5 in 2.5 
        bufer.delete(2, 6); // delete .333 in 33.333
        
         System.out.printf("buffer after deletes:%n%s%n", bufer.toString());
    }
}
