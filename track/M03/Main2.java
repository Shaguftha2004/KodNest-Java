
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Enter the size: ");
        int a[] = new int[n];
        int b[] = new int[a.length + 1];
        System.out.println("Enter the elements: ");
        for (int i = 1; i < n; i++) {
            a[i] = s.nextInt();
            b[i] = a[i];
        }
        System.out.println("Enter the elements to be added: ");
        int elements = s.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 1; i < b.length; i++) {
            if (i == 1) {
                b[i + 1] = b[i];
                b[i] = elements;
            }
            System.out.println(b[i] + " ");
        }
    }
}
