package pack.lab28.examples.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ExampleSortSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("geeks");
        set.add("practice");
        set.add("contribute");
        set.add("ide");

        System.out.println("Origunal HashSet: " + set);

        List<String> list = new ArrayList<String>(set);

        Collections.sort(list);

        System.out.println("Sorted list: " + list);
    }
}
