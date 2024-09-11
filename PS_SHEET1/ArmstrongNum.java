//question//
Calculating Armstrong Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is an Armstrong number.
Example:
Input: number = 153
Output: Armstrong Number
Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.


  //code//
   public static boolean isArmstrong(int input) {
        int originalNumber = input;
        int numberOfDigits = String.valueOf(input).length();
        int sum = 0;

        while (input > 0) {
            int lastDigit = input % 10;
            int digitPower = 1;

            // Calculate lastDigit to the power of numberOfDigits
            for (int i = 0; i < numberOfDigits; i++) {
                digitPower *= lastDigit;
            }

            sum += digitPower; // Add the powered digit to sum
            input /= 10; // Remove the last digit
        }

        return sum == originalNumber; // Check if the sum equals the original number
    }
