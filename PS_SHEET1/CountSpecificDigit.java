//question//
Finding the Count of Specific Digits in a Number
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to count the occurrences of a specific digit in a number.
Example:
Input: number = 122333, digit = 3
Output: 3
Explanation: The digit 3 occurs 3 times in the number 122333.

//code//
public class CountSpecificDigit {
    public static void main(String[] args) {
        int number = 122333;
        int digit = 3;
        System.out.println(countDigitOccurrences(number, digit));
    }

    public static int countDigitOccurrences(int number, int digit) {
        String numStr = Integer.toString(number);
        char digitChar = (char) (digit + '0'); // Convert int to char
        int count = 0;
        for (char c : numStr.toCharArray()) {
            if (c == digitChar) {
                count++;
            }
        }
        return count;
    }
}
