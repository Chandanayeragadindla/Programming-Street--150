//question//
Finding the Sum of Elements in an Array
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find the sum of elements in an array.
Example:
Input: array = [1, 2, 3, 4, 5]
Output: 15
Explanation: The sum of the elements in the array is 15.

  //code//
  import java.util.Scanner;

public class sumOfElements {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       int n = arr.length;
       int sum = 0;
        for (int i = 0; i <n ; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
