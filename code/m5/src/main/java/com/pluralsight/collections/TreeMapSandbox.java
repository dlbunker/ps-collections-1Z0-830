package com.pluralsight.collections;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;

public class TreeMapSandbox {
    public static void main(String[] args) {
        TreeMapSandbox sandbox = new TreeMapSandbox();
        sandbox.digTheSand();
    }

    private void digTheSand(){
        TreeMap<String, Integer> studentScores = new TreeMap<>();
        studentScores.put("Alice", 85);
        studentScores.put("Charlie", 90);
        studentScores.put("Bob", 78);

        System.out.println(studentScores);

        System.out.println("First student: " + studentScores.firstKey());  // Alice
        System.out.println("Last student: " + studentScores.lastKey());    // Charlie

        System.out.println("Students before Charlie: " + studentScores.headMap("Charlie"));
        System.out.println("Students from Bob and after: " + studentScores.tailMap("Bob"));
        System.out.println("Only Bob: " + studentScores.subMap("Bob", "Charlie"));

        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " scored " + entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : studentScores.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

//        studentScores.put(null, 95);  // Throws NullPointerException
        studentScores.put("David", null);  // Works fine

        Map<String, Integer> reverseTreeMap = new TreeMap<>(Comparator.reverseOrder());
        reverseTreeMap.putAll(studentScores);
        System.out.println(reverseTreeMap);

    }
}
