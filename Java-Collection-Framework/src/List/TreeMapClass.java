package List;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        //TreeMap<Integer, Object> map = new TreeMap<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(100, 1);
        map.put(1, 100);
        map.put(-10, 20);
        System.out.println(map);
        Integer cur = map.get(1);
        cur += (-100);
        map.put(1, cur);
        System.out.println(map);
        boolean yo = map.containsKey(1);
        System.out.println(yo);
        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            System.out.println(it.getKey() + " " + it.getValue());
        }
        for(Integer it : map.keySet()){
            System.out.println(it + " using key " + map.get(it));
        }
        HashSet<Integer> st = new HashSet<>();
        st.add(100);
        st.add(-1);
        st.add(200);
        System.out.println(st);
    }
}
