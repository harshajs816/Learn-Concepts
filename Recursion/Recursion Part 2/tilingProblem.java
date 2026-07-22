public class tilingProblem{

public static int tilingProb(int n){

    if(n==0 || n==1){
        return 1;
    }

    // agar verticle rakhenge
    int fnm1 = tilingProb(n-1);

    // agar horizontal rakhenge

    int fnm2 = tilingProb(n-2);

    int totalWays = fnm1 + fnm2;
    return totalWays;
}

public static void main(String[] args) {
    int n = 4;
    System.out.print(tilingProb(n));
}

}