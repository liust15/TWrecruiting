package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import cn.school.thoughtworks.section2.PracticeC;


public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        PracticeC practiceC=new PracticeC();
        PracticeB practiceB=new PracticeB();

        Map<String, Integer> stringIntegerMap = practiceC.countSameElements(collectionA);

        return  practiceB.createUpdatedCollection(stringIntegerMap,object);
    }
}
