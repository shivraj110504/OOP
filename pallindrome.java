package Assignments;

import java.util.Scanner;

public class pallindrome {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
 
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        
        scanner.close();
    }
    public static boolean isPalindrome(int number) {
        int reversed = 0, original = number, remainder;
        
        while (number > 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        
        return reversed == original;
    }
}
