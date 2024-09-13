//  question//
Finding the Fibonacci Number at a Specific Position
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to find the Fibonacci number at a specific position.
Example:
Input: position = 5
Output: 5
Explanation: The Fibonacci number at position 5 is 5 (sequence: 0, 1, 1, 2, 3, 5).

//question//
  import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the position
        int position = sc.nextInt();

        // Get the Fibonacci number at the specific position
        int fibNumber = findFibonacci(position);

        // Output the result
        System.out.println("Fibonacci number at position " + position + " is: " + fibNumber);
    }

    public static int findFibonacci(int n) {
        // Handle the base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Initialize the first two Fibonacci numbers
        int a = 0, b = 1, fib = 0;

        // Calculate Fibonacci for n >= 2
        for (int i = 2; i <= n; i++) {
            fib = a + b; // F(n) = F(n-1) + F(n-2)
            a = b;       // Move a to b (F(n-2) becomes F(n-1))
            b = fib;     // Move b to fib (F(n-1) becomes F(n))
        }

        return fib; // Return the Fibonacci number at position n
    }
}
