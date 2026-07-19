public class convertToBInary {

    public static int decimalToBinary(int n){
        int power = 0;
        int binary = 0;
        while(n > 0){
            int lastDigit = n % 2;
            binary = binary + lastDigit * (int)Math.pow(10,power);
            power++;
            n = n / 2;
        }
        return binary;

    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
    }
}
