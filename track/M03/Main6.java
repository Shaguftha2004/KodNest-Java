
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the elements");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long p[] = new long[n];
        p[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            p[i] = p[i - 1] + a[i];
        }
        p[0] = a[0];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            p[i] = sum;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(p[i] + " ");
        }
    }
}
