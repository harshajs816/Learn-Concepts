

public class clearLastIthBit {

    public static int clrLastIthBit(int n , int i){
        int BitMask = (~0)<<i;
        return n & BitMask ;

    }
    public static void main (String s[]){
        System.out.println(clrLastIthBit(15, 2));
    }
}