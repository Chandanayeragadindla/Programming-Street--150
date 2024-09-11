
//question - 1//
Determining Even/Odd Numbers
Difficulty: Easy
Topics: Basic Programming
Description: Write a program to check whether a number is even or odd.
Example:
Input: number = 4
Output: Even
Explanation: Since 4 is divisible by 2, it is an even number.

//code//
import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(isEven(input));
    }
    public static boolean isEven(int input){
        if(input%2 == 0){
            System.out.println(" even ");
        }
        else {
            System.out.println(" odd ");
        }
        return false;
    }
}

