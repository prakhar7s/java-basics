import java.util.*;

class ArrayListDemo {

    public static void main(String[] args) {

        // init arraylist
        ArrayList<String> fruits = new ArrayList<String>();

        // add data in arraylist
        fruits.add("Apples");
        fruits.add("Banana");
        fruits.add("Orange");

        // create iterator
        Iterator itr = fruits.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
