package com.pluralsight.generics;

import java.util.*;

public class GenericsSandbox {
    public static void main(String[] args) {
        GenericsSandbox sandbox = new GenericsSandbox();
        sandbox.digTheSand();

        // Unbounded wildcard demo
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println("Printing names:");
        printList(names);

        // Upper bounded wildcard demo
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        System.out.println("Sum of integers: " + sumNumbers(integers));

        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("Sum of doubles: " + sumNumbers(doubles));

        // Lower bounded wildcard demo
        List<Number> numbersList = new ArrayList<>();
        addInteger(numbersList); // Adds 100 to the list
        System.out.println("After adding an integer: " + numbersList);

    }

    private void digTheSand(){
        // Declare and initialize a List of Strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // The compiler will flag an error if you try to add a non-string value:
//         fruits.add(10); // Uncommenting this line will cause a compile-time error

        // Iterate over the list and print each fruit
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Declare and initialize a Map with Integer keys and String values
        Map<Integer, String> idToFruit = new HashMap<>();
        idToFruit.put(1, "Apple");
        idToFruit.put(2, "Banana");
        idToFruit.put(3, "Cherry");

        // Iterate over the map using entrySet()
        for (Map.Entry<Integer, String> entry : idToFruit.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }

    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void addInteger(List<? super Integer> list) {
        // The lower bound ensures it's safe to add an Integer
        list.add(100);
    }

}
