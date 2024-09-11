
//question// 
  Generating the Fibonacci Series
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to generate the Fibonacci series up to a given number.
Example:
Input: limit = 10
Output: [0, 1, 1, 2, 3, 5, 8]
Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].

//code//
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int limit = sc.nextInt();
        List<Integer> fibonacciseries = generatefibonacciseries(limit);
        System.out.println("Fibonacci series up to " + limit + ": " + fibonacciseries);
    }
    public static List<Integer> generatefibonacciseries(int limit){
        List<Integer> series = new ArrayList<>();
        int a = 0;
        int b = 1;
        if(limit >= a){
            series.add(a);
        }
        if (limit >= b){
            series.add(b);
        }

        while (true){
            int next = a+b;
            if(next> limit){
                break;
            }
            series.add(next);
            a = b;
            b = next;
        }
        return series;

    }

}
