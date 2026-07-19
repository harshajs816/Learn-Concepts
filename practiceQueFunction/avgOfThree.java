package practiceQueFunction;

import java.util.*;
public class avgOfThree {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first digit: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second digit : ");
        int num2 = sc.nextInt();
        System.out.print("Enter third digit : ");
        int num3 = sc.nextInt();
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("Average of three numbers is: " + avg);

    }
}