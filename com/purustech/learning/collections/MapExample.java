package com.purustech.learning.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
          Map<Integer,String> rollNumberNameMap = new HashMap<>();  // does not guarantee of retrieval how it has been put to map
         // Map<Integer,String> rollNumberNameMap = new TreeMap<>();  // guarantee of retrieval by keys in sorted manner
        // Map<Integer,String> rollNumberNameMap = new LinkedHashMap<>();  // guarantee of retrieval by in the order they are inserted

        // here in above String is used as Value, it can contain any other object, custom object or any List
        rollNumberNameMap.put(1,"Harish");
        rollNumberNameMap.put(5,"Xavier");
        rollNumberNameMap.put(2,"Arun");


        // iterating the map using new for each loop by using key set
        System.out.println("===========iterate by using key set===========");
        for(Integer rollNumber: rollNumberNameMap.keySet()){
            System.out.println("Roll number: " + rollNumber + " Name: " + rollNumberNameMap.get(rollNumber));
        }

        // iterating using new for loop by using entry set
        System.out.println("===========iterating by using entry set ==============");
        for(Map.Entry<Integer,String> entry: rollNumberNameMap.entrySet())
        {
            System.out.println("Roll number: " + entry.getKey() + " Name: " + entry.getValue());
            // rollNumberNameMap.remove(2);  cause ConcurrentModificationException
        }

        // getting element directly by key
        System.out.println("Roll number 5 , student name is: " + rollNumberNameMap.get(5)); // Xavier

        // checking whether key is present in map or not
        System.out.println("Roll number 6 present in map ?? "  + rollNumberNameMap.containsKey(6)); // false

        // checking whether value is present in map or not
        System.out.println("Name Arun present in map ?? "  + rollNumberNameMap.containsValue("Arun")); // true

        // get the size of map
        System.out.println("size of student roll number and name map is: "  + rollNumberNameMap.size()); // 3

        // checking if map is empty or not
        System.out.println("is student roll number and name map is empty ? "  + rollNumberNameMap.isEmpty()); // false

        rollNumberNameMap.put(1,"Santosh"); // override the value

        System.out.println("AFter replacing Harish");
        for(Integer rollNumber: rollNumberNameMap.keySet()){
            System.out.println("Roll number: " + rollNumber + " Name: " + rollNumberNameMap.get(rollNumber));
        }

        // removing key value from map , here removing the student with roll number 1
        String nameRemoved = rollNumberNameMap.remove(1);
         System.out.println("Student name " + nameRemoved + " removed");


    }
}
