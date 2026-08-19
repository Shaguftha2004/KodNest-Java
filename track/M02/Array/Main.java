
public class Main {

    public static void main(String[] args) {
        int[] stock = {4, 12, 2, 9, 5};
        int recordedLevel = 5;
        int recordedCount = 0;
        for (int i = 0; i <= stock.length; i++) {
            if (stock[i] <= recordedLevel) {
                recordedCount++;
            }
        }
        System.out.println("Items to reorderd: " + recordedCount);
    }
}
