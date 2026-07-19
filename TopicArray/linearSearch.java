package TopicArray;


public class linearSearch {

    public static int arrayLinerar(int number[] , int key){
        for(int i= 0; i < number.length ; i++){
            if (number[i] == key){
                return i;
            }
           
        }
          return -1;
    }

    
    public static void main(String[] args) {
        int number[] = {10,20,50,70,80};
        int key = 50;
        int index = arrayLinerar(number, key);
        if (index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index :"+ " " +index);
        }


    }
}