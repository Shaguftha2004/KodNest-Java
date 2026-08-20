
public class Main1 {

    public static void main(String arg[]) {
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;
        int[] snapshot = new int[readings.length];
        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
        }
        readings[updateIndex] = newValue;
        System.out.println("Snapshot: ");
        for (int val : snapshot) {
            System.out.println(" " + val);
        }
        System.out.println();
        System.out.println("Updated: ");
        for (int val : readings) {
            System.out.println(" " + val);
        }

    }
}
