
public class StringBuilder2 {

    public static void main(String[] args) {
        StringBuilder sbr = new StringBuilder("java");
        sbr.ensureCapacity(100);
        System.out.println(sbr.capacity());
        System.out.println(sbr);
        sbr.append("program");
        System.out.println(sbr);
    }
}
