package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
       List<String> list=object.get("value");
         for (int i = 0; i <list.size() ; i++) {
            String temp=list.get(i);
            int count=fTDO(collectionA.get(temp));
            collectionA.put(temp,count);
        }

        return collectionA;
    }
    //满三减一
    public int fTDO(int i){
        int temp=i/3;
        return i-temp;
    }
}
