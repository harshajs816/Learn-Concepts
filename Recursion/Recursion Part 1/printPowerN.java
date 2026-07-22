public class printPowerN {

    public static int power(int x , int n){
        if(n==0){
            return 1;
        }

        int xpnm1= power(x, n-1);
        int xpn = x * xpnm1; 

        return xpn; 
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x, n));

    }
    
}
