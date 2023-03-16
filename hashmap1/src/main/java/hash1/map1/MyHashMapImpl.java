package hash1.map1;

import java.util.ArrayList;

public class MyHashMapImpl <K, V> {

    final static int max_buckets = 10;
    ArrayList<MyTuple<K, V>>[] buckets = new ArrayList[10];

    ArrayList<V> values = new ArrayList<>();

    public MyHashMapImpl() {
        for (int i = 0; i < max_buckets; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    private int getBucketNumber(int hashcode) {
        return hashcode % 10;
    }

    public void put(K key, V value) {
        int bucket_number = getBucketNumber(key.hashCode());

        for (var tuple : buckets[bucket_number]) {
            if (key.equals(tuple.k)) {
                tuple.v = value;
                return;
            }
        }

        buckets[bucket_number].add(new MyTuple<>(key, value));
    }

//    public boolean remove(K key) {
//        if (keys.contains(key)) {
//            int index = keys.indexOf(key);
//            keys.remove(index);
//            values.remove(index);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean contains(K key) {
//        return keys.contains(key);
//    }
//
//    public V get(K key) {
//        if (keys.contains(key)) {
//            int index = keys.indexOf(key);
//            return values.get(index);
//        }
//        throw new IllegalArgumentException("no key found");
//    }

}

