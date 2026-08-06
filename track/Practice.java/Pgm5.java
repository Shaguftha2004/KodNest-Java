
public class Pgm5 {

    public static void main(String[] args) {
        int practiceDay = 5;
        int sessionsPerDay = 2;
        int revisionDay = 3;
        int finalDaySessionLimit = 1;
        int targetSessions = 7;
        int completedSessions = 0;
        Outer:
        for (int day = 1; day <= practiceDay; day++) {
            if (day == revisionDay) {
                continue Outer;
            }
            Inner:
            for (int session = 1; session <= sessionsPerDay; session++) {
                if (day == 5 && session == 2) {
                    break Inner;
                }
                System.out.println("Day " + day + " - " + "Session " + session);
                completedSessions++;
            }
        }
        System.out.println("Completed Session: " + completedSessions);
        if (completedSessions >= targetSessions) {
            System.out.println("Target Achieved");
        }
    }
}
