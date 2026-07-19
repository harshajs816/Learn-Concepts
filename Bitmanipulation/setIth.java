public class setIth {
 
    public static int setIthValue(int n , int i){
        int bitMask = 1<<i;
        return (n|bitMask);
    }

        public static void main (String s[]){
            System.out.print(setIthValue(10, 2));
        }
}