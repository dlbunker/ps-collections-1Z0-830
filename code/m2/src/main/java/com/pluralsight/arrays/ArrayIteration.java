package com.pluralsight.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayIteration {
    public static void main(String[] args) {
        ArrayIteration arrayIteration = new ArrayIteration();
        arrayIteration.arrayTest();
    }

    private void arrayTest(){
        String[] instruments = {"guitar", "drums", "bass"};
        System.out.println(instruments.length);

        int[] ids = new int[10];

        for (int i = 0; i < ids.length; i++) {
            ids[i] = i * i; // Assigning squared values
            System.out.println(ids[i]); // Accessing elements
        }

        for (String instrument : instruments) {
            System.out.println(instrument);
        }

        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5); // {1, 2, 3, 0, 0}

        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[5];
        System.arraycopy(source, 0, destination, 0, 3);

        int[] clonedArray = original.clone();

        Arrays.sort(instruments);

        System.out.println(Arrays.toString(instruments));

        Arrays.sort(instruments, Comparator.reverseOrder());

        System.out.println(Arrays.toString(instruments));

        int[] fibArray = {0, 1, 5, 2, 3, 1, 8, 13};

        System.out.println(Arrays.binarySearch(fibArray, 3));

        Arrays.sort(fibArray);
        System.out.println(Arrays.toString(fibArray));
        System.out.println(Arrays.binarySearch(fibArray, 3));

    }
}
