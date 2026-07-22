

public class optimizedPowerN {

    public static int optimizedPower(int x,int n){
        if(n==0){
            return 1;
        }

        // for even power
        int halfPower = optimizedPower(x, n/2);
        int halfPowerSqr = halfPower*halfPower;

        if( n%2 != 0){
            return  x*halfPowerSqr;
        }

        return halfPowerSqr;
    }

    public static void main(String[] args) {
        int x= 2;
        int n= 7;

        System.out.println(optimizedPower(x, n));
    }
    
}
