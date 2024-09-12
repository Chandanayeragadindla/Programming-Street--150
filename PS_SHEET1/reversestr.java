//question//
Reversing a String
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to reverse a given string.
Example:
Input: string = "programming"
Output: "gnimmargorp"
Explanation: The reversed string of "programming" is "gnimmargorp".






//code//
import java.util.*;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        // Call the reverse method and print the result
        String reversedStr = reverseStr(str);
        System.out.println("Reversed string: " + reversedStr);

        // Close the scanner
        sc.close();
    }

    public static String reverseStr(String str) {
        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        int i = 0;
        int j = charArray.length - 1;

        // Swap characters from both ends
        while (i < j) {
            // Swap characters at i and j
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

            // Move pointers towards the center
            i++;
            j--;
        }

        // Convert the char array back to a string and return it
        return new String(charArray);
    }

    }
