package hash1.map1;

import java.util.ArrayList;
import java.util.HashSet;

public class MyHashMap <K, V> {

    ArrayList<K> keys = new ArrayList<>();

    ArrayList<V> values = new ArrayList<>();

    public ArrayList<K> getKeys() {
        return (ArrayList<K>)keys.clone();
    }

    public ArrayList<V> getValues() {
        return (ArrayList<V>)values.clone();
    }

    public void put(K key, V value) {
        if (keys.contains(key)) {
            values.set(keys.indexOf(key), value);
            return;
        }
        keys.add(key);
        values.add(value);
    }

    public boolean remove(K key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            keys.remove(index);
            values.remove(index);
            return true;
        }
        return false;
    }

    public boolean contains(K key) {
        return keys.contains(key);
    }

    public V get(K key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            return values.get(index);
        }
        throw new IllegalArgumentException("no key found");
    }

}
