package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

import cn.school.thoughtworks.section2.PracticeA;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        PracticeA practiceA=new PracticeA();
        PracticeB practiceB=new PracticeB();

        Map<String, Integer> stringIntegerMap = practiceA.countSameElements(collectionA);

        return  practiceB.createUpdatedCollection(stringIntegerMap,object);
    }

}
