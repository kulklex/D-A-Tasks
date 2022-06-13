public class StringConstructors {
    public static void main(String[] args) {
        char[] charArray = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y', ' ', 'd', 'a', 't', 'h'};
        String s = new String("hello"); 
        String s1 = new String();
        String s2 = new String(s);
        String s3 = new String(charArray);
        String s4 = new String(charArray, 6, 3);

        System.out.printf("s1 = %s%ns2 = %s%ns3= %s%ns4 = %s%n", s1, s2, s3, s4);

        String s5 = "hello there";
         charArray = new char[5];
         System.out.printf("s5: %s", s5);
         System.out.printf("%nLength of s1: %d", s5.length());
         System.out.printf("%nThe string reversed is: ");
         for(int count = s5.length() - 1; count>=0; count--){
             System.out.printf("%c", s5.charAt(count));
         }
         s5.getChars(0, 5, charArray, 0);
         System.out.printf("%n The character array is: ");

         for(char character : charArray){
             System.out.print(character);
         }
         System.out.println();
    }
}
