package TopicArray;

public class largestArray {
     public static int getLarger(int marks[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < marks.length; i++) {
            if (largest < marks[i]) {
                largest = marks[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int marks[] = {98, 99, 97, 96, 94, 95};
        System.out.println("The largest value is: " + getLarger(marks));
    }
} 
    

