package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSandbox {
    public static void main(String[] args) {
        HashMapSandbox sandbox = new HashMapSandbox();
        sandbox.digTheSand();
    }

    private void digTheSand(){
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);
        ages.put("Alice", 32);  // Overwrites previous value for "Alice"
        System.out.println(ages);

        System.out.println(ages.get("Alice"));  // 32
        System.out.println(ages.get("David"));  // null (key not found)
        System.out.println(ages.containsKey("Bob"));  // true
        System.out.println(ages.containsValue(40));   // false

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }

        for (String name : ages.keySet()) {
            System.out.println(name);
        }

        for (int age : ages.values()) {
            System.out.println(age);
        }

        ages.remove("Charlie");  // Removes the key "Charlie"
        System.out.println(ages);

        Map<String, String> map = new HashMap<>();
        map.put(null, "No Name");  // One null key allowed
        map.put("Alice", null);    // Multiple null values allowed
        System.out.println(map);

        List<String> names = new ArrayList<>(ages.keySet());
        System.out.println(names);

        List<Integer> ageList = new ArrayList<>(ages.values());
        System.out.println(ageList);

    }
}
