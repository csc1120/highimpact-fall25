package wk12.lecture;

public interface PureMap<K, V> {

    /**
     * Returns the value of the given key or
     * null if not present.
     * @param obj key we are looking for
     * @return value of the key or null
     */
    V get(K obj);

    /**
     * If the key is not in the map, creates
     * a new entry with the key and value and
     * adds it. Else replaces the value at that key
     * @param key
     * @param value
     * @return returns previous value if present or null
     */
    V put(K key, V value);

    /**
     * Removes the entry with the given key
     * @param key
     * @return returns the previous value or null if not
     * entry existed
     */
    V remove(Object key);

    boolean isEmpty();

    int size();

}
