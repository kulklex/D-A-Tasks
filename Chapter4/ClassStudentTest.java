
public class ClassStudentTest {
    public static void main(String[] args) {
        ClassStudent student1 = new ClassStudent("John Smith", 78.9);
        ClassStudent student2 = new ClassStudent("Jane Doe", 27.43);

        System.out.printf("%s's grade is: %s%n", student1.getStudentName(), student1.getLetterGrade());
        System.out.printf("%s's grade is: %s%n", student2.getStudentName(), student2.getLetterGrade());
    }
}
