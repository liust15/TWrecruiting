package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> list=object.get("value");
        for (int i = 0; i <list.size() ; i++) {
            String temp=list.get(i);
            int count=collectionA.get(temp)-1;
           collectionA.put(temp,count);
        }
        return collectionA;
    }
}
