
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}

public class Main {

    public static void main(String[] args) {
        MethodDemo m = new MethodDemo();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        m.sayHello();
        m.greet("name");
        int third = m.getLuckyNumber();
        System.out.println("Lucky Number: " + getLuckyNumber);
        int sum = m.add(first, second);
        System.out.println("Sum: " + sum);

    }
}
