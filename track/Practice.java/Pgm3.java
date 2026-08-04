
public class Pgm3 {

    public static void main(String[] args) {
        int marks = 72;
        int attendance = 80;
        boolean activeBacklogs = false;
        boolean projectCompleted = true;
        int mockInterviewScore = 65;
        boolean academicEligibility = (marks >= 60 && attendance >= 75 && !activeBacklogs);
        if (academicEligibility = false) {
            System.out.println("Improve academicEligibility");
        } else if (academicEligibility && !projectCompleted) {
            System.out.println("Complete the project");
        } else if (projectCompleted && mockInterviewScore <= 70) {
            System.out.println("Improve Interview Skills");
        } else {
            System.out.println("Placement Ready");
        }
    }
}
