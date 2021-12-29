import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> hSet = new HashSet<String>();

        hSet.add("Banana");
        hSet.add("Apple");

        // loop through the hashset
        Iterator itr = hSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // check if set contains that element
        boolean isBanana = hSet.contains("Banana");
        System.out.println(isBanana);

        boolean isOrange = hSet.contains("Orange");
        System.out.println(isOrange);

    }
}
