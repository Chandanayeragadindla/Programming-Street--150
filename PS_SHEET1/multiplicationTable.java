//question//
Generating Multiplication Tables
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to generate multiplication tables for a given number.
Example:
Input: number = 4
Output:

4 x 1 = 4  
4 x 2 = 8  
4 x 3 = 12  
4 x 4 = 16  
4 x 5 = 20  
//code//
  import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        multiplication(number);
    }
    public static void  multiplication(int number){
        for (int i = 1; i <=10; i++) {
            System.out.println( number + "*"+ i +"="+ (number*i) + " ");
        }
        }
    }
