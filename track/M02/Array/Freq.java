
class Main {

    int count = 0;

    void count(int arr[], int key) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println(key + ":" + count);
    }
}

public class Freq {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 40};
        Main fs = new Main();
        fs.count(arr, 30);
    }
}
