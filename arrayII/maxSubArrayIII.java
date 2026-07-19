public class maxSubArrayIII {

    public static void kadaneRule(int number[]) {
         int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i =0 ; i < number.length ; i++){
            currSum = currSum + number[i];
            if (currSum < 0) {
                currSum = 0;
                 }
                 maxSum = Math.max(currSum, maxSum);
            }
            
            System.out.println("max sum of array is : " + maxSum);
    }

    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        kadaneRule(number);
        
    }
    
}
