import java.util.*;
public class sumUsingFunc {
   
    public static int calcuSum(int num1, int num2) {
       int  sum = num1+num2;
       return sum;
    }
   
 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();

  
       System.out.println("The total sum is " + calcuSum(a, b));

    }
}
