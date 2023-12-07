package pack.lab28.examples.ex2;

import java.util.Hashtable;
import java.util.Map;

public class Test {
    public static void test() {
        Map<String, Student> map = new Hashtable<String, Student>();

        Student st = new Student(0, "Alex", 18);
        map.put("Alex", st);
        System.out.println(map.get("Alex"));
        System.out.println(map.get("Al" + "ex"));
        System.out.println(map.get(st.getName()));

        String s = "a";
        s = s.toUpperCase() + "lex";

        System.out.println(map.get(s));
    }

    public static void main(String[] args) {
        test();
    }
}
