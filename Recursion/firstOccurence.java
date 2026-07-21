public class firstOccurence {

       public static int firstOccur(int arr[] , int key , int i){
        
        if (arr[i]==arr.length){
            return -1;
        };
        
        if (arr[i] == key){
            return i;
        };

        return firstOccur(arr, key, i+1);
       }

    public static void main(String[] args) {
        int arr[]= {1,3,4,6,7,5,8,3,6};
        System.out.println(firstOccur(arr,6,0));

    }
    
}
