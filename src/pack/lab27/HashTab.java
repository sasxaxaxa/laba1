package pack.lab27;

import java.util.Arrays;


public class HashTab {
    private final int size = 10;
    private final Elem[] table;

    public HashTab() {
        table = new Elem[size];
        Arrays.fill(table, null);
    }

    public class Elem {
        private final String key;
        private final int value;
        private Elem nextelem = null;

        public Elem(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hashtabHash(String key) {
        return key.hashCode() % size;
    }

    public void hashtabAdd(String key, int value) {
        int index = hashtabHash(key);
        Elem elem = new Elem(key, value);

        if (table[index] == null) {
            table[index] = elem;
        } else {
            Elem current = table[index];
            while (current.nextelem != null) {
                current = current.nextelem;
            }
            current.nextelem = elem;
        }
    }

    public int hashtabLookup(String key) {
        int index = hashtabHash(key);
        Elem currentelem = table[index];

        while (currentelem != null) {
            if (currentelem.key.equals(key)) {
                return currentelem.value;
            }
            currentelem = currentelem.nextelem;
        }
        return -1;
    }

    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        Elem currentelem = table[index];
        Elem previouselem = null;

        while (currentelem != null && !currentelem.key.equals(key)) {
            previouselem = currentelem;
            currentelem = currentelem.nextelem;
        }

        if (currentelem != null) {
            if (previouselem == null) {
                table[index] = currentelem.nextelem;
            } else {
                previouselem.nextelem = currentelem.nextelem;
            }
        }
    }
}