public class convertToDeci {

    public static int binaryToDecimal(int n){
       int power= 0;
        int decimal = 0;
        while(n >0){
            int lastDigit = n % 10;
            decimal = decimal + lastDigit * (int)Math.pow(2,power);
            power++;
            n = n / 10;
        }
        return decimal;

    }
    public static void main(String[] args) {
        System.out.println(binaryToDecimal(1010));
    }
}
