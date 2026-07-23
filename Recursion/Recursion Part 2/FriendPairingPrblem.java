//
/**
 * FriendPairingPrblem
 */
public class FriendPairingPrblem {

    public static int FriendPairing(int n){
        //Base case 
        if( n==0 || n==1){
            return 1;
        }
        // kaam
        // for single 
        int fnm1 = FriendPairing(n-1);

        // for pair (two or more)
        int fnm2 = FriendPairing(n-2);
        int pairway = (n-1)+ fnm2;

        // Total Ways
        int totalWays = fnm1 + pairway;
        return totalWays;


    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(FriendPairing(n));
        
    }
}