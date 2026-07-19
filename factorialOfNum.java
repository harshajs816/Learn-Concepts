import java.util.*;
public class factorialOfNum {

public static int factorial(int num) {

   int f=1;
    for(int i = 1; i <= num; i++){
        f = f*i;
     
    }
   
 return f;
}

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n : ");
        int n = sc.nextInt() ;
        System.out.print("Enter r : ");
        int r = sc.nextInt();
       int diff = n-r;
       int a = factorial(n);
       int b = factorial(r);
       int c = factorial(n-r);
       double binomialCoeff = a/b*c;
 
    System.out.println(binomialCoeff);
    }
}