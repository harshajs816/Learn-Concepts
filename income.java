import java.util.*;
public class income {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);  
       double salary = sc.nextDouble();
       if (salary < 500000){
        System.out.println(salary);
       }
       else if (salary <1000000){
        System.out.println(salary*0.2);
       }
       else{
        System.out.println(salary*0.3);
       }
    }

    
}
