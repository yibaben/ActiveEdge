package exercise1;

import java.util.HashSet;
import java.util.Set;

public class SmallestNonOccurringInteger {
    public static int findSmallestNonOccurringInteger(int[] array) {
        Set<Integer> set = new HashSet<>();
        // Add all positive integers in the array to a set
        for (int num : array) {
            if (num > 0) {
                set.add(num);
            }
        }
        // Check for the smallest non-occurring integer starting from 1
        int smallest = 1;
        while (set.contains(smallest)) {
            smallest++;
        }

        return smallest;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 3, 6, 4, 1, 2};
        int result1 = findSmallestNonOccurringInteger(array1);
        System.out.println("Smallest non-occurring integer in Array1: " + result1);

        int[] array2 = {5, -1, -3};
        int result2 = findSmallestNonOccurringInteger(array2);
        System.out.println("Smallest non-occurring integer in Array2: " + result2);
    }
}
