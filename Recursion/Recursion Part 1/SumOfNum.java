public class SumOfNum {

    public static int TotalSum(int n ){
        if (n==1){
            return 1;
        }
        int snm1 = TotalSum(n-1);
        int sum = n + TotalSum(n-1);
        return sum;
     }



    public static void main(String[] args) {
        int n =5;
        System.out.println(TotalSum(n));
        
    }
    
}
