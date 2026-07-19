public class binarySearch {

    public static int binary(int number[], int key){
        int start = 0;
        int end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key){
                return mid;
            }

            if (number[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {1,2,4,8,16,32,64,128,256,512,1024};
        int key = 256;

        int index = binary(number, key);
        System.out.println("The index number of " + key + " is : " + index); 
    }
}