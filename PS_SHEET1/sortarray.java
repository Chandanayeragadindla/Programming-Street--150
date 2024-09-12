//question//
Sorting an Array
Difficulty: Easy
Topics: Basic Programming, Sorting Algorithms
Description: Write a program to sort an array of numbers in ascending order.
Example:
Input: array = [3, 1, 4, 1, 5, 9]
Output: [1, 1, 3, 4, 5, 9]
Explanation: The array sorted in ascending order is [1, 1, 3, 4, 5, 9]


//code//
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}


