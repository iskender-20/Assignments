package assignment_1;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    /**
     * Q1: Write a program to clone an array
     */
    public static int[] cloneArray(int[] originalArray) {

        return originalArray.clone();
    }

    /**
     * Q2: Write a program in Java to remove a random element from an array
     */
    public static int[] removeRandomElement(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }


        Random random = new Random();
        int randomIndex = random.nextInt(array.length);
        
        int[] newArray = new int[array.length - 1];
        

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != randomIndex) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }

    /**
     * Q3: Write a program in Java to remove a specific element from an array
     */

    public static int[] removeSpecificElement(int[] array, int elementToRemove) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        
        int count = 0;
        for (int element : array) {
            if (element == elementToRemove) {
                count++;

            }
        }
        
        if (count == 0) {
            return array;
        }

        int[] newArray = new int[array.length - count];
        int j = 0;
        
        for (int element : array) {

            if (element != elementToRemove) {
                newArray[j++] = element;
            }
        }
        return newArray;
    }

    /**
     * Q4: Write a Java program to reverse an array
     */
    public static void reverseArray(int[] array) {

        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            start++;
            end--;
        }
    }
}

