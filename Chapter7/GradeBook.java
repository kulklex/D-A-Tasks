public class GradeBook {
    private String courseName;
    private int[] grades;

    public GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName(){
        return courseName;
    }

    public void processGrades(){
        outputGrades();

        System.out.printf("%nClass average is %.2f%n", getAverage());

        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

    }

    public int getMinimum(){
        int lowerGrade = grades[0];
        for(int grade : grades){
            if(grade < lowerGrade){
                lowerGrade = grade;
            }
        }
        return lowerGrade;
    }

    public int getMaximum(){
        int highestGrade = grades[1];
        for(int grade : grades){
            if( grade > highestGrade){
                highestGrade = grade;
            }
        }
        return highestGrade;
    }

    public double getAverage(){
        int total = 0;
        for(int grade : grades){
            total += grade;
        }
        double average = (double) total/(grades.length);
        return average;
    }

    public void outputGrades(){
        System.out.printf("The grades are:%n%n");

        for(int student = 0; student < grades.length; ++student){
            System.out.printf("Student %2d: %3d%n", student+1, grades[student]);
        }
    }
}
