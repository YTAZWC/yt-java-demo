package top.ytazwc.equalshashcode;

import java.util.*;

/**
 * @author 花木凋零成兰
 * @title SlowMap
 * @date 2024/5/4 22:47
 * @package top.ytazwc.equalshashcode
 * @description 用一对ArrayLists实现了一个Map,包含了Map接口的完整实现,提供了entrySet()方法
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();
    @Override
    public V put(K key, V value) {
        // The old value or null
        V oldValue = get(key);
        if(!keys.contains(key)) {
            keys.add(key);
            values.add(value);
        } else {
            values.set(keys.indexOf(key), value);
        }
        return oldValue;
    }
    @Override
    public V get(Object key) { // key: type Object, not K
        if(!keys.contains(key)) {
            return null;
        }
        return values.get(keys.indexOf(key));
    }
    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set= new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while(ki.hasNext()) {
            set.add(new MapEntry<K,V>(ki.next(), vi.next()));
        }
        return set;
    }
    public static void main(String[] args) {
        SlowMap<String,String> m= new SlowMap<>();
        // m.putAll(Countries.capitals(8));
        m.forEach((k, v) ->
                System.out.println(k + "=" + v));
        System.out.println(m.get("BENIN"));
        m.entrySet().forEach(System.out::println);
    }
}
