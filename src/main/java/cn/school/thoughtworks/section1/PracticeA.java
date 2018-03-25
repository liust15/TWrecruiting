package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> collection = new ArrayList<>();
        for (int i = 0; i < collection1.size(); i++) {
            for (int j = 0; j < collection2.size(); j++) {
                if (collection1.get(i) == collection2.get(j)) {
                    collection.add(collection1.get(i));
                }
            }
        }
        //实现练习要求，并改写该行代码。
        return collection;
    }
}
