//question//
Identifying Palindromes
Difficulty: Easy
Topics: Basic Programming, String Manipulation
Description: Write a program to check if a string or number is a palindrome.
Example:
Input: string = "radar"
Output: Palindrome
Explanation: "radar" reads the same backward as forward.
  //code//
  import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = input.nextLine();
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
        int i = 0;
        int j = str.length()-1;
        for (int k = 0; k < str.length()-1; k++) {
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
                return true;
            }
        }
        return false;
    }
}
