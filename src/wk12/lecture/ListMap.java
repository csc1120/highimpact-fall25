package wk12.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListMap<K,V> implements PureMap<K, V> {

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
    private final List<Entry<K,V>> items;
    public ListMap(){
        items = new ArrayList<>();
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
        boolean found = false;
        int index = -1;
        for(int i = 0; i<items.size() && !found; i++){
            if(Objects.equals(items.get(i).key, obj)){
                found = true;
                index = i;
            }
        }
        if(index == -1){
            return null;
        } else {
            return items.get(index).value;
        }
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
        boolean found = false;
        V ret = null;
        for(int i = 0; i<items.size() && !found; i++){
            if(Objects.equals(key, items.get(i).key)){
                ret = items.get(i).value;
                items.get(i).value = value;
            }
        }
        if(!found){
            items.add(new Entry<>(key, value));
        }
        return ret;
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
        boolean found = false;
        int index = -1;
        for(int i = 0; i<items.size() && !found; i++){
            if(Objects.equals(items.get(i).key, key)){
                found = true;

                index = i;
            }
        }
        if(index == -1){
            return null;
        } else {
            V ret = items.get(index).value;
            items.remove(index);
            return ret;
        }
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }
}
