/**
 * PrintIncreasingOrder
 * 
 * n => 1,2,3,4,5,6,7,8,9,10
 */
public class PrintIncreasingOrder {

    public static void PrintInc(int n){

        if (n==10){
            System.out.println("10");
            return;
        }

        System.out.print(n + " ");
        PrintInc(n+1);
    }

    // Another method 

    public static void PrintIncreasing(int n){
         if (n==1){
            System.out.println("1");
            return;
            }

            PrintIncreasing(n-1);
            System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        PrintIncreasing(n);

    }
}