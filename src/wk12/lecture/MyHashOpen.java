package wk12.lecture;

import java.util.Objects;

public class MyHashOpen<K,V> implements PureMap<K,V> {

    private static class Entry<K, V> {
        private final K key;
        private V value;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
        public String toString(){
            return "(" + key + "," + value+")";
        }
    }
    private Entry<K,V>[] table;
    private int numKeys;
    private int START_CAP = 101;
    public MyHashOpen(){
        table = new Entry[START_CAP];
        numKeys = 0;
    }
    private int find(Object key){
        int index = key.hashCode() % table.length;
        if(index < 0){
            index += table.length;
        }
        //first thing we might encounter?

        if(Objects.equals(table[index].key, key)){
            return index;
        } else if(table[index] == null){
            return index;
        }
        while(table[index] != null &&
                !Objects.equals(table[index].key, key)){
            index += 1;
            index = index % table.length;
        }
        return index;
    }
    /**
     * If the key is not in the map, creates
     * a new entry with the key and value and
     * adds it. Else replaces the value at that key
     *
     * @param key
     * @param value
     * @return returns previous value if present or null
     */
    @Override
    public V put(K key, V value) {
        return null;
    }

    /**
     * Returns the value of the given key or
     * null if not present.
     *
     * @param obj key we are looking for
     * @return value of the key or null
     */
    @Override
    public V get(K obj) {
        return null;
    }



    /**
     * Removes the entry with the given key
     *
     * @param key
     * @return returns the previous value or null if not
     * entry existed
     */
    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
