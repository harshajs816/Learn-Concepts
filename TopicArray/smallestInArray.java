package TopicArray;

public class smallestInArray {
public static int getLarger(int number[]) {
      int smallest = Integer.MAX_VALUE;

      for(int i = 0; i < number.length; i++) {
         if (smallest < number[i]) {
            smallest = number[i];
         }
      }

      return smallest;
   }

   public static void main(String[]ar0) {
      int number[] = {98, 99, 97, 96, 94, 95};
      System.out.println("The largest value is: " + getLarger(number));
   }
}

    
