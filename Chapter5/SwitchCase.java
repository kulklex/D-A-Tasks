import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int Acount = 0;
        int  Bcount = 0;
        int Ccount = 0;
        int  Dcount = 0;
        int  Fcount = 0;
        int gradeCounter = 0;
        System.out.printf(
            " Enter the integer grades in the range 0-100.%n Type the end-of-file indicator to terminate input:%n On UNIX/LINUX/Mac OS X type Ctrl d then press Enter%n On Windows type Ctrl Z then press Enter");

            while(input.hasNext()){
                int grade = input.nextInt();
                total += grade;
                ++gradeCounter;

                switch (grade/10) {
                    case 9:
                    case 10:
                        ++Acount;
                        break;

                    case 8:
                        ++Bcount;
                        break;
                    case 7:
                        ++Ccount;
                        break;
                    case 6: 
                        ++Dcount;
                        break;
                
                    default:
                        ++Fcount;
                        break;
                }
            }
            System.out.printf("%nGrade Report:%n");
            
            if (gradeCounter!=0){
                double average = (double) total/gradeCounter;

                System.out.printf("Total of the %d grades entered are %d%n", gradeCounter, total);
                System.out.printf("Class Average is %.2f%n", average);
                System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                 "Number of Students who recevied each grade: ", 
                 "A: ", Acount,
                 "B: ", Bcount,
                 "C: ", Ccount,
                 "D: ", Dcount,
                 "F: ", Fcount);
            } else{
                System.out.println("No grades were entered");
            }
            input.close();
    }
}
