public class subarray {

    public static void printSubarray(int number[]){
int totalSubGrp= 0;
        for(int i = 0 ; i< number.length ; i++){
            int start = i;
            for(int j = i ; j < number.length; j++){
                int end = j ;
            for(int k = start ; k <= end; k++ ){
                System.out.print(number[k]+ " ");
           

            }
                 totalSubGrp++;
            System.out.println();
            }
                

        }
        System.out.println("total subGroup :" + totalSubGrp);
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        printSubarray(number);
        

    }
}
