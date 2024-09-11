//question//
inding the Factorial of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to compute the factorial of a given number.
Example:
Input: number = 5
Output: 120
Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.


  //code//
  import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();

        // Calculate the factorial using the method
        int factorial = factorialOfNumber(input);

        // Display the result
        System.out.println("The factorial of " + input + " is: " + factorial);
    }

    // Method to calculate factorial
    public static int factorialOfNumber(int input) {
        // Base case: factorial of 0 or 1 is 1
        if (input == 0 || input == 1) {
            return 1;
        }
        // Recursive case
        return input * factorialOfNumber(input - 1);
    }
}
