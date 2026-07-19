import java.util.*;
public class while_upto_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n  = sc.nextInt();
        int count = 1;
        int sum = 0;
        
        while(count<=n){
            sum = sum + count;
              count++;
     }
                 System.out.println("Sum of " + n +" numbers is :" + sum);
    }
}
