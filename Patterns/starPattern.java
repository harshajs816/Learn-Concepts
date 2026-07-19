public class starPattern {
    public static void main(String[] args) {
        int n=4;
        for (int line=1; line<=n; line++){  // outerlopp mtlb line line print karwani h 
            for (int star=1;star<=line; star++){ //kitne star print karwane h 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
