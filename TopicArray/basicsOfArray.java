package TopicArray;

import java.util.*;

public class basicsOfArray {

    public static void main(String[] args) {
        int marks[] = new int[20];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();  // input Values
        marks[1] = sc.nextInt();  // input Values
        marks[2] = sc.nextInt();  // input Values
        marks[3] = sc.nextInt();  // input Values

System.out.println("Phy :" + marks[0]);  // output Values
System.out.println("Che :" + marks[1]);  // output Values
System.out.println("Math :" + marks[2]);  // output Values
System.out.println("Eng :" + marks[3]);  // output Values
        
marks[3] = marks[3] + 1; // update
System.out.println("Eng :" + marks[3]);

    }
    
}