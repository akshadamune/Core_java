import java.util.HashMap;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Akshada");
        map.put(102, "Piyush");
        map.put(103, "Payal");

        System.out.println(map.get(102));
        System.out.println(map.containsKey(103));
        System.out.println(map.remove(101));

        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

    }
}