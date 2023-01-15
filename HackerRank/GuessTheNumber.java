import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNumber;
    int max;
    Scanner input = new Scanner(System.in);

    public GuessTheNumber() {
        Random random = new Random();
        max = 100;
        theNumber = Math.abs(random.nextInt()) % (max + 1);
    }

    public void play() {
        while (true) {
            int move = input.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big");
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("GREAT JOB!");
                break;
            }
        }
    }

    

    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        System.out.println("Welcome to this guess game, Type a number within a range of 0-100 inclusive" + '\n');
        guessTheNumber.play();
     
    }
}