
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Pranav");
        list.add("Piyush");
        list.add("Akshada");
        list.add("Payal");
        list.add("Parachi");

        LinkedList<String> names = new LinkedList<>();
        names.add("Akshada");
        names.add("Piyush");
        names.add("Rahul");
        names.add("Gaurav");

        list.addFirst("Pratik");
        list.addLast("Pranali");
        list.contains("Akshada");

        list.getFirst();
        list.getLast();

        System.out.println(list.set(3, "Yogesh"));
        System.out.println(list.contains("Akshada"));
        list.set(3, "Yogesh");
        System.out.println(list);

    }
}