
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.next();
        char charArr[] = str.toCharArray();
        char revArr[] = new char[charArr.length];
        int j = revArr.length - 1;
        for (int i = 0; i <= charArr.length - 1; i++) {
            revArr[j] = charArr[i];
            j--;
        }
        String revStr = new String(revArr);
        if (str.equalsIgnoreCase(revStr)) {
            System.out.println("The give String is a Palindrome");
        } else {
            System.out.println("The give String is not a Palindrome");
        }
    }
}
