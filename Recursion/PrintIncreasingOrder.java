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

    public static void main(String[] args) {
        int n = 1;
        PrintInc(n);

    }
}