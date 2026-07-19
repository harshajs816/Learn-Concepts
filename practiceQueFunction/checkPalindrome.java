package practiceQueFunction;

import java.util.*;

public class checkPalindrome {

    public static int reverse(int n) {
        int reverse =0;
        while(n>0){
            int lastDigit = n % 10;
            reverse = (reverse *10) + lastDigit;
            n = n/10;
        }
        return reverse;

        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(reverse(n) == n){
            System.out.println("Palindrome");
        }
        else{
         System.out.println("Not Palindrome");
        }
    }
    
}