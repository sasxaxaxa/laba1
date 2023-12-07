package pack.lab28.exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetTree {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>(10);

        map.put("a", "one");
        map.put("b", "one");
        map.put("c", "two");
        map.put("d", "two");
        map.put("e", "three");
        map.put("f", "three");
        map.put("g", "three");
        map.put("h", "three");
        map.put("i", "one");
        map.put("j", "one");

        return map;
    }

    public static int getSameLastNameCount(Map<String, String> map) {
        Set<String> firstNames = new HashSet<>(map.values());

        int size1 = map.size();
        int size2 = firstNames.size();

        return size1 - size2;

        //не мой метод
        //int count = 0;
        //        Set<String> lastNames = new HashSet<>(map.keySet());
        //        for (String lastName : lastNames) {
        //            int frequency = Collections.frequency(map.keySet(), lastName);
        //            if (frequency > 1) {
        //                count += frequency;
        //            }
        //        }
        //        return count;
        //    }
    }


    public static void main(String[] args) {
        Map<String, String> map = createMap();

        System.out.println("HashMap: " + map);
        System.out.println("Значений: " + map.size());

        int i = getSameLastNameCount(map);
        System.out.println("Количество повторений значений: " + i);

        //не мой метод
//        int count = 0;
//        Iterator<String> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            String value = map.get(key);
//            if (map.values().contains(value) || map.keySet().contains(value)) {
//                count++;
//            }
//        }
    }
}