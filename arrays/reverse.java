public class reverse {
    
    public static void reverse(int number[]) {
        int first =0;
        int last = number.length-1;
        while(first < last){
            int temp = number[last];
            number[last] = number[first];
            number[first]= temp;
            first ++;
            last --;
            
        }
    }

    public static void main(String[] args) {
        int number[] = {2,4,8,16,32,64,128,256,512,1024,2048,4096,8192};

        reverse(number);
        for(int i = 1; i <number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();


}
}
