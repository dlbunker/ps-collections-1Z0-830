package com.pluralsight.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSandbox {
    public static void main(String[] args) {
        ArrayListSandbox sandbox = new ArrayListSandbox();
        sandbox.digTheSand();
    }

    private void digTheSand(){
        List<String> instruments = new ArrayList<>();

        instruments.add("Guitar");
        instruments.add("Piano");
        instruments.add("Violin");

        System.out.println(instruments.get(1)); // Prints "Piano"

        instruments.remove("Piano"); // Removes "Piano"
        instruments.remove(0); // Removes the first element

        for (String instrument : instruments) {
            System.out.println(instrument);
        }

        String[] arr = {"Flute", "Drum", "Saxophone"};
        List<String> list = new ArrayList<>(List.of(arr)); // Proper conversion

        String[] backToArray = instruments.toArray(new String[0]);

    }
}
