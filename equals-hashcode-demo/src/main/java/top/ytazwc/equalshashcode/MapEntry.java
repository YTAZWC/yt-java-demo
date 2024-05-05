package top.ytazwc.equalshashcode;

import java.util.Map;
import java.util.Objects;

/**
 * @author 花木凋零成兰
 * @title MapEntry
 * @date 2024/5/4 23:03
 * @package top.ytazwc.equalshashcode
 * @description A simple Map.Entry for sample Map implementations
 */
public class MapEntry<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;
    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public K getKey() { return key; }
    @Override
    public V getValue() { return value; }
    @Override
    public V setValue(V v) {
        V result = value;
        value = v;
        return result;
    }
    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(Object rval) {
        return rval instanceof MapEntry &&
                Objects.equals(key,
                        ((MapEntry<K, V>)rval).getKey()) &&
                Objects.equals(value,
                        ((MapEntry<K, V>)rval).getValue());
    }
    @Override
    public String toString() {
        return key + "=" + value;
    }
}
