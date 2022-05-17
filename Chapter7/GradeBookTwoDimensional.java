public class GradeBookTwoDimensional {
    private String courseName ;
    private int[][] grades ;

    public GradeBookTwoDimensional(String courseName, int[][] grades){
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
        System.out.printf("%n%s %d%n%s %d%n%n", 
        "Lowest grade in the grade book is ", getMinimum(),
        "Highest grade in the grade book is", getMaximum());
    }

    public int getMinimum(){
        int lowerGrade = grades[0][0];
        for (int[] studentgrades : grades){
            for(int grade : studentgrades){
                if (grade < lowerGrade){
                    lowerGrade = grade;
                }
            }
        }
        return lowerGrade;
    }

    public int getMaximum(){
        int highestGrade = grades[0][0];
        for (int[] studentgrades : grades){
            for(int grade : studentgrades){
                if (grade > highestGrade){
                    highestGrade = grade;
                }
            }
        }
        return highestGrade;
    }

    public double getAverage(int[] setOfGrades){
        int total = 0;
        for(int grade: setOfGrades){total+=grade;}
        return (double) total / setOfGrades.length;
    }

    public void outputGrades(){
        System.out.printf("The grades are:%n%n");
        System.out.print("       ");

        for(int test = 0; test < grades[0].length; test++)
        System.out.printf("Test %d ", test+1);

        System.out.println("Average");
        for(int student = 0; student < grades.length; student++){
            System.out.printf("%2d", student+1);

            for(int test : grades[student])
            System.out.printf("%8d", test);

            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
