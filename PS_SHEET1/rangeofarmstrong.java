//question//
Checking for Armstrong Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all Armstrong numbers within a given range.
Example:
Input: range = [1, 500]
Output: [1, 153, 370, 371, 407]
Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407.


//code//
import java.util.Scanner;

public class RangeOfArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the start and end of the range
        System.out.print("Enter the first number of the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the second number of the range: ");
        int end = sc.nextInt();

        // Find and print Armstrong numbers in the range
        findArmstrongNumbers(start, end);

        // Close the Scanner
        sc.close();
    }

    // Method to find Armstrong numbers in a given range
    public static void findArmstrongNumbers(int start, int end) {
        boolean found = false;

        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.println(num + " is an Armstrong number.");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Armstrong numbers found in the range.");
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int numOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numOfDigits); // Raise digit to the power of number of digits
            num /= 10;
        }

        return sum == originalNumber;
    }
}
