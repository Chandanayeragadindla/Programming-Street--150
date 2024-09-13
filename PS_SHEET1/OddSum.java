//question//
Calculating the Sum of Odd Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of all odd numbers within a given range.
Example:
Input: range = [1, 10]
Output: 25
Explanation: The sum of odd numbers between 1 and 10 is 1 + 3 + 5 + 7 + 9 = 25.

//code//
  import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int Odd = Oddsum(start,end);
        System.out.println("Oddsum "+ Odd);
    }
    public static int Oddsum(int start,int end){
        int Oddsum = 0;
        for (int num = start; num <= end; num++) {
            if(num%2 != 0){
                Oddsum += num;
                //.out.println(EvenSum);
            }
        }
        return Oddsum;
    }
}
