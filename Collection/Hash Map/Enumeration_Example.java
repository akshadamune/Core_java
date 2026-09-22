import java.util.Hashtable;
import java.util.Enumeration;

public class Enumeration_Example {
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(101, "Akshada");
        map.put(102, "Piyush");
        map.put(103, "Payal");

        Enumeration<Integer> keys = map.keys();
        while (keys.hasMoreElements()) {
            Integer id = keys.nextElement();
            System.out.println(id);

        }

        Enumeration<String> value = map.elements();
        while (value.hasMoreElements()) {
            String name = value.nextElement();
            System.out.println(name);

        }
    }
}