//question//
Calculating the Sum of Even Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of all even numbers within a given range.
Example:
Input: range = [1, 10]
Output: 30
Explanation: The sum of even numbers between 1 and 10 is 2 + 4 + 6 + 8 + 10 = 30.


//code//
import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int Even = Evennum(start,end);
        System.out.println("Evensum "+ Even);
    }
    public static int Evennum(int start,int end){
        int EvenSum = 0;
        for (int num = start; num <= end; num++) {
            if(num%2 == 0){
                EvenSum += num;
                //.out.println(EvenSum);
            }
        }
        return EvenSum;
    }
}
