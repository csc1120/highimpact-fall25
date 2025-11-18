package wk12.prep;

public interface PureMap<K, V> {
    /**
     * Returns the value associated
     * with the specified key. Returns
     * null if the key is not present
     * @param key key of the value to return
     * @return value of the key passed in or
     * null if the key is not present
     */
    V get(Object key);

    /**
     * Returns true if this table contains
     * no key-value mappings
     * @return true is the table contains
     * no key-value mappings
     */
    boolean isEmpty();

    /**
     * Associates the specified value with the
     * specified key. Returns the previous value
     * associated with the specified key, or null
     * if there was no mapping for the key
     * @param key key of the entry to add
     * @param value value of the entry to add
     * @return previous value for the specified key
     * or null if the key was not present prior
     */
    V put(K key, V value);
    /**
     * Removes the mapping for this key from this
     * table if it is present (optional operation).
     * Returns the previous value associated with the
     * specified key, or null if there was no mapping
     * @param key key of the entry to remove
     * @return value of the entry removed or null
     * if the entry did not exist
     */
    V remove(Object key);

    /**
     * Returns the number of entries in the map
     * @return number of entries in the map
     */
    int size();

}
