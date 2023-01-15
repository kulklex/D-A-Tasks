import java.util.Scanner;

public class StringSplit {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        char [] ch = S.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(i % 2 == 0){
                System.out.print(ch[i]);
            }
        } 
        System.out.print("  ");

        for (int i = 0; i < ch.length; i++) {
            if(i % 2 == 1) {
                System.out.print(ch[i]);
            }
         }

        scanner.close();
    }
}
