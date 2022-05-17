public class TimeCaseStudyTest {
    public static void main(String[] args) {
        TimeClassCaseStudy time = new TimeClassCaseStudy();

        displayTime("After time object is created", time);
        System.out.println();

        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        try {
            time.setTime(99, 99, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception %s%n%n", e.getMessage());
        }

        displayTime("Afer calling setTime with invalid values", time);
    }

    private static void displayTime(String header, TimeClassCaseStudy time){
        System.out.printf("%s%nUniversal time: %s%nStandard Time: %s%n",
        header, time.toGlobalString(), time.toString());
    }
}
