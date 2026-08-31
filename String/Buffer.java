public class Buffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Pranav");

        sb.append("Patil");
        System.out.println(sb);

        // insret

        sb.insert(0, "Hello"); // Hello

        sb.delete(0, 0);
        System.out.println(sb);
    }
}
