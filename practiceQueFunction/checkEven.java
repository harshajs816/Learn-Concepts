package practiceQueFunction;

public class checkEven {

    public static boolean isEven(int n){
        if (n % 2 == 0){
            return true;
        }
        return false;
    }
    
    
    public static void main(String[] args) {
        System.out.println(isEven(13));
        System.out.println(isEven(12));
        
    }
}
