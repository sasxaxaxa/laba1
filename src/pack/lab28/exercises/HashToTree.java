package pack.lab28.exercises;

import java.util.HashSet;
import java.util.TreeSet;

public class HashToTree {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");

        System.out.println("HashSet: " + set);
        TreeSet<String> tree = new TreeSet<String>(set);

        System.out.println("TreeSet: " + tree);
    }
}


