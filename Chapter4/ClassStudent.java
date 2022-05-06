
public class ClassStudent {
    private String studentName;
    private double average;

    public ClassStudent(String studentName, double average){
        this.studentName = studentName;
        if(average > 0.0)
            if(average <= 100.0){
                this.average = average;
            }
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public void setAverage(double average){
        if(average > 0.0 || average <= 100.0){
            this.average = average;
        }
    }

    public String getStudentName(){
        return this.studentName;
    }

    public double getAverage(){
        return this.average;
    }

    public String getLetterGrade(){
        String letterGrade = "";
        if(average >= 90.0){
            letterGrade = "A";
        } else if (average >= 80.0){
            letterGrade = "B";
        } else if (average >= 70.0){
            letterGrade = "C";
        } else if (average >= 60.0){
            letterGrade = "D";
        } else if (average <= 50.0){
            letterGrade = "E";
        }
        return letterGrade;
    }
}
