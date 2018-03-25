package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> collection = new ArrayList<>();
        List<String> newCollection2=collection2.get("value");
        for (int i = 0; i < collection1.size(); i++) {
            for (int j = 0; j < newCollection2.size(); j++) {
                if (collection1.get(i) == newCollection2.get(j)) {
                    collection.add(collection1.get(i));
                }
            }
        }
        //实现练习要求，并改写该行代码。
        return collection;
    }
}
