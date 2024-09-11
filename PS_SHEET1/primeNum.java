//question//
Checking for Prime Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is prime.
Example:
Input: number = 7
Output: Prime
Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.


//code//
import java.util.Scanner;

public class primeNum {
    public static boolean IsPrime(int input){
        if(input <=1){
            System.out.println(" not prime ");
            return false;
        }
        if(input == 2){
            System.out.println(" the number you entered is even prime ");
            return true;
        }

        for (int i = 2; i < Math.sqrt(input); i++) {
            if(input % i == 0){
                System.out.println( i + ":"  + input +":" + " the number you entered is not prime : ");
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(IsPrime(input));
    }
}
