//question//
Finding the Greatest Common Divisor (GCD)
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find the GCD of two numbers.
Example:
Input: a = 48, b = 18
Output: 6
Explanation: The GCD of 48 and 18 is 6.

//code//
  import java.util.Scanner;

public class summing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt(); // Get the input from the user

        int summing = summ(num); // Call the summing function to get the sum of digits

        System.out.println("The sum of digits in " + num + " is: " + summing); // Display the result
    }

    public static int summ(int num) {
        int sum = 0;
        while(num > 0) {
            int digit = num % 10; // Get the last digit of the number
            sum += digit; // Add the digit to the sum
            num = num / 10; // Remove the last digit from the number
        }
        return sum; // Return the total sum of digits
    }
}
