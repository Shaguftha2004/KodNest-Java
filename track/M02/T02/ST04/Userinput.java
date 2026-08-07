
import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter byte value : ");
        byte a = scan.nextByte();
        System.out.println("Byte values is " + a);
        System.out.println("enter short value : ");
        short b = scan.nextShort();
        System.out.println("Short value is " + b);
        System.out.println("enter integer value : ");
        int c = scan.nextInt();
        System.out.println("Integer values is " + c);
        System.out.println("enter long value : ");
        long d = scan.nextLong();
        System.out.println("Long values is " + d);
        System.out.println("enter float value : ");
        float e = scan.nextFloat();
        System.out.println("Float values is " + e);
        System.out.println("enter double value : ");
        double f = scan.nextDouble();
        System.out.println("Double values is " + f);
        System.out.println("enter boolean value : ");
        boolean g = scan.nextBoolean();
        System.out.println("Boolean values is " + g);
    }
}
