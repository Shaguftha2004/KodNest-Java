
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = s.next();
        String s2 = s.next();
        if (s1.length() != s2.length()) {
            System.out.println("NOT ANAGRAM");
            return;
        }
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String sortedStr1 = new String(arr1);
        String sortedStr2 = new String(arr2);
        if (sortedStr1.equals(sortedStr2)) {
            System.out.println("Given String Anagram");
        } else {
            System.out.println("Given String are NOT Anagram");
        }

    }
}
