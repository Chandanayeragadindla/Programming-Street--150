//question//
Checking for Perfect Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is a perfect number.
Example:
Input: number = 28
Output: Perfect Number
Explanation: 28 is a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.


  //code//
  import java.util.Scanner;

public class perfectnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isperfecrt( num));
    }
    public  static boolean isperfecrt(int num){
        int sum = 0;
        for (int i = 1; i<= num/2 ; i++) {
            if(num%i == 0){
                sum = sum + i;
            }
        }
        return sum == num;
    }
}
