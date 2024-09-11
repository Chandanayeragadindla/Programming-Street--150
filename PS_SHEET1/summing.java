//question//
Summing Digits of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to calculate the sum of digits of a number.
Example:
Input: number = 1234
Output: 10
Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.




/code/
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
