//question//
Finding the Largest and Smallest Numbers in an Array
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find the largest and smallest numbers in an array.
Example:
Input: array = [4, 7, 1, 8, 5]
Output: Largest: 8, Smallest: 1
Explanation: The largest number in the array is 8 and the smallest is 1.
  //code//
  import java.util.Scanner;

public class FindLargestSmallest {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        // Declare an array of size 'n'
        int[] array = new int[n];
        
        // Prompt the user to input elements into the array
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Initialize largest and smallest with the first element of the array
        int largest = array[0];
        int smallest = array[0];
        
        // Traverse through the array to find the largest and smallest numbers
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i]; // Update largest if the current element is greater
            }
            if (array[i] < smallest) {
                smallest = array[i]; // Update smallest if the current element is smaller
            }
        }
        
        // Print the result
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        
        // Close the scanner object
        scanner.close();
    }
}
