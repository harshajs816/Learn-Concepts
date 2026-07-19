import java.util.*;
public class multiByFunc {

    public static int multi(int num1, int num2){
    int multiply = num1 * num2;
    return multiply;    
    }
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
  System.out.print("Enter A : ");
   int a = sc.nextInt();
   System.out.print("Enter B : ");
   int b = sc.nextInt();
    int product = multi(a,b); 
    System.out.println("A * B : "+ product);
}
    
}