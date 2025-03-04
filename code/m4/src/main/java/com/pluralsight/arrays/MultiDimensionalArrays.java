package com.pluralsight.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        MultiDimensionalArrays arrayMD = new MultiDimensionalArrays();
        arrayMD.arrayTest();
    }

    private void arrayTest(){
        int[][] multiArray = new int[3][3];

        String[][] multiArray2 = new String[3][10];

        String[][] westCoastCitiesGrouped = {
                {"LA", "San Francisco", "San Diego"},
                {"Seattle", "Tacoma"},
                {"Portland"}
        };

        for (int i = 0; i < westCoastCitiesGrouped.length; i++) {
            for (int j = 0; j < westCoastCitiesGrouped[i].length; j++) {
                System.out.println(westCoastCitiesGrouped[i][j]);
            }
        }

        for (String[] row : westCoastCitiesGrouped) {
            for (String city : row) {
                System.out.println(city);
            }
        }

        System.out.println(Arrays.toString(westCoastCitiesGrouped));
        System.out.println(Arrays.deepToString(westCoastCitiesGrouped));

        int[][] nums = {
                {1, 2, 3},
                {4, 5},
                {6}
        };
        System.out.println(nums.length); // 3 (number of rows)
        System.out.println(nums[0].length); // 3 (first row size)
        System.out.println(nums[1].length); // 2 (second row size)

    }
}
