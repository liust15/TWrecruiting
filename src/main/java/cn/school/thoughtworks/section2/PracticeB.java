package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    public Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map map = new HashMap<String, Integer>();
        map.put(collection1.get(0), 1);
        int count = 1;
        for (int i = 1; i < collection1.size(); i++) {
            String temp = collection1.get(i);
            if (temp.length() != 1){
                count = getInt(temp);
            temp = getStr(temp);}
            if (map.containsKey(temp)) {
                int tempCount = (int) map.get(temp) + count;
                map.put(temp, tempCount);
            } else {

                map.put(temp, count);
            }
            count = 1;
        }
        return map;
    }

    public static String getStr(String string) {
        return string.replaceAll("[^a-z]", "");
    }

    public int getInt(String string) {
        return Integer.parseInt(string.replaceAll("[^0-9]", ""));
    }
}
