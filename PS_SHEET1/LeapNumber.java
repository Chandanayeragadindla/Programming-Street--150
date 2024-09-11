//question//
Validating Leap Years
Difficulty: Easy
Topics: Basic Programming, Date Handling
Description: Write a program to check if a given year is a leap year.
Example:
Input: year = 2020
Output: Leap Year
Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.

//code//
  import java.util.*;
public class LeapYear {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Read the year from user
                System.out.print("Enter a year: ");
                int year = scanner.nextInt();

                // Check if the year is a leap year
                if (isLeapYear(year)) {
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is Not a Leap Year.");
                }

                scanner.close();
            }

            // Method to check if a year is a leap year
            public static boolean isLeapYear(int year) {
                if (year % 400 == 0) {
                    return true; // Divisible by 400
                } else if (year % 100 == 0) {
                    return false; // Divisible by 100 but not by 400
                } else if (year % 4 == 0) {
                    return true; // Divisible by 4 but not by 100
                } else {
                    return false; // Not divisible by 4
                }
            }
        }
// even the conditions changes in code it would fail to give correct answer so conditions has to be coded properly to get correcr output // 
1. year/400 == 0  true;
2 . year/100 == 0 false;
3.year/4 == true;


