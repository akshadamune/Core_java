import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Akshada");
        names.add("Piyush");
        names.add("Rahul");
        names.add("Gaurav");

        System.out.println(names);

        // second way to use to show output
        // for (String num : names) {
        // System.out.println(num);
        // }

        ArrayList<Integer> age = new ArrayList<>();
        age.add(1);
        age.add(2);
        age.add(3);
        age.add(4);

        System.out.println(age);

        ArrayList<String> list = new ArrayList<>();
        list.add("Akshada");
        list.add("Piyush");
        list.add("Rahul");
        list.add("Gaurav");

        System.out.println(list);
        System.err.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.set(3, "Yogesh"));
        System.out.println(list.contains("Gaurav"));
        System.out.println(list.indexOf("Akshada"));
        System.out.println(list.isEmpty());
        System.out.println(list.set(3, "Yogesh"));
        System.out.println(list.removeAll(list));

        // it use to to convert Arraylist to Array
        // Object[] arr = list.toArray();
        // System.out.println(Arrays.toString(arr));

    }
}
