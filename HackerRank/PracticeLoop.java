import java.util.Scanner;

public class PracticeLoop {
 
    public static void practiceForLoop() {
        for(int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                System.out.println( x + ", " + y);
            }
        }
    }

    public static void multipleOfTen(){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Any Integer To Get It's Multiple Of Ten: ");
        n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n*i));
        }
        input.close();
    }
    
    public static void main(String[] args) {
        // practiceForLoop();
        multipleOfTen();
    }
}
