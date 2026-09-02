
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int l = a[i];
            a[i] = a[j];
            a[j] = l;
            i++;
            j--;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + " ");
        }
    }
}
