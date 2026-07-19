/*   *****     sirf boundries pr he star hai....
     *   *     mtlb row 1 ya 4 // col 1 ho ya 5 ho 
     *   *      
     *****                          */



public class HollowRectangle {

    public static void hollow_reactangle(int totrow, int totcol){
    //outer loop
    for(int i = 1; i<=totrow ; i++){
        for(int j = 1; j<=totcol ; j++){
            if(i==1 || i==totrow || j==1 || j==totcol){
                System.out.print("*");
            }
            else{
              System.out.print(" ");
            }
        }
        System.out.println();
    }
}

public static void main(String[] args) {
 hollow_reactangle(4,5);  
}
  


    }
    

