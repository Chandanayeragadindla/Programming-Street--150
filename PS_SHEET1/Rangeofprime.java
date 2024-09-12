//question//
Finding Prime Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all prime numbers within a given range.
Example:
Input: range = [10, 30]
Output: [11, 13, 17, 19, 23, 29]
Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.


//code//
import java.util.Scanner;

public class primenumbersINRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
         rangeofprime(n1, n2);
    }
    public static void rangeofprime(int n1, int n2){
        for (int i = n1; i <=n2 ; i++) {
            if(isprime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
