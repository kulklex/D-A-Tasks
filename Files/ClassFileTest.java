import java.util.Scanner;

public class ClassFileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClassFile file = new ClassFile();
        System.out.print("Enter file or directory name here: ");
        file.analyzePath(input.nextLine());
        input.close();
    }
}
