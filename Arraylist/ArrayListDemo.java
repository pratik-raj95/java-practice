import java.util.*;

public class ArrayListDemo { // ✅ Use a different class name
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list); // [10, 20, 30]
        System.out.println(list.get(0)); // 10
        System.out.println(list.size()); // 3

        list.remove(1); // Removes 20
        System.out.println(list.size()); // 2
        System.out.println(list.contains(20)); // false

        // System.out.println(list.get(10)); ❌ Commented to avoid error

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(102);
        list.add(203);
        list.add(304);

        Collections.sort(list); // Sorts the list

        System.out.println(list); // [10, 10, 20, 30, 30, 102, 203, 304]
        System.out.println(Collections.binarySearch(list, 20)); // Valid search
        System.out.println(Collections.binarySearch(list, 100)); // Returns negative value
    }
}
