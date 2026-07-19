import java.util.*;
public class largerofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int number ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c){
            number = a;
        }
        else if (c>b) {
            number = c;
        }
        else {
          number = b;
        }

System.out.println("largest number is " + number);

    }
}
