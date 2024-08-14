import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public String[] findRestaurant(String[] list1, String[] list2) {
    Map<String, Integer> countMap = new HashMap<>();
    Map<String, Integer> indexMap = new HashMap<>();
    Integer count = 0;
    for (int i = 0; i < list1.length; i++) {
        count = countMap.get(list1[i]);
        if (count == null) {
            countMap.put(list1[i], 1);
            indexMap.put(list1[i], i);
        } else {
            countMap.put(list1[i], ++count);
            indexMap.put(list1[i], indexMap.get(list1[i]) + i);
        }
    }
    for (int i = 0; i < list2.length; i++) {
        count = countMap.get(list2[i]);
        if (count == null) {
            countMap.put(list2[i], 1);
            indexMap.put(list2[i], i);
        } else {
            countMap.put(list2[i], ++count);
            indexMap.put(list2[i], indexMap.get(list2[i]) + i);
        }
    }
    int minIdx = 2000;
    for (Map.Entry<String, Integer> e : countMap.entrySet()) {
        if (e.getValue().compareTo(2) == 0) {
            minIdx = Math.min(minIdx, indexMap.get(e.getKey()));
        }
    }
    // 1472 = 600 + 872
    // 1472 = 1000 + 472
    List<String> strings = new ArrayList<>();
    for (Map.Entry<String, Integer> e : countMap.entrySet()) {
        if (e.getValue().compareTo(2) == 0) {
            if (minIdx == indexMap.get(e.getKey()))
                strings.add(e.getKey());
        }
    }
    return strings.stream().toArray(String[]::new);
}
}
