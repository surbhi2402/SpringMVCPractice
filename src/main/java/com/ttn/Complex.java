package com.ttn;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Complex {

    List<Integer> list;
    Set<String> set;
    Map<String,String> map;

    public List getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void printListElements() {
        for (int element: list) {
            System.out.println("List Element = "+ element);
        }
        System.out.println();
    }

    public void printSetElements() {
        for (String element: set) {
            System.out.println("Set Element = "+ element);
        }
        System.out.println();
    }

    public void printMapElements() {
        for (Map.Entry<String,String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key : "+ key + " Value : "+ value);
        }
        System.out.println();
    }

}
