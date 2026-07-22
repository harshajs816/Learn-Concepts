

/**
 * Nto1
 * n=10 => 10,9,8,7,6,5,4,3,2,1
 */
public class Nto1 {

    public static void PrintDec(int n){

        if(n == 1){
            System.out.println("1");
            return;
        }

        System.out.print(n + " ");
        PrintDec(n-1);
    }

    public static void main(String[] args) {
        int n =10;
       PrintDec(n);
    }
}