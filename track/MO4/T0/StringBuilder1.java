
public class StringBuilder1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("java");
        System.err.println("sb");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("is a programming Language");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("and object oriented");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
