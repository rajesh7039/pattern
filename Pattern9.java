import java.util.*;
public class Main {
    public static void main(String args[]) {
      int i,j;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Rows : ");
      int Number=sc.nextInt();
      
      
      /*9)
      Repeat Horizontal
      *
      **
      ***
      **
      *
      
      */
    System.out.print("Enter Counter : ");
    int Counter=sc.nextInt();
    
    for(i=1;i<=Number;i++){
        for(j=i;j<Number;j++){
            System.out.print(" ");
        }
        for(int k=1;k<2*i;k++){
            System.out.print("*");
        }
        
        for(int c=1;c<=Counter-1;c++){
            for(j=i;j<Number;j++){
                System.out.print(" ");
            }
            for(j=i;j<Number-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                if(k==i & k==Number){
                    System.out.print("");
                }
                else{
                    System.out.print("*");
                }
            }
        }//End for loop for counter
        
        System.out.println();
    }
    
    
    for(i=Number-1;i>=1;i--){
        for(j=Number;j>i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<(i*2);k++){
            
            System.out.print("*");
        }
        
        for(int c=1;c<=Counter-1;c++){
            for(j=Number;j>i;j--){
                System.out.print(" ");
            }
            for(j=Number-1;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                System.out.print("*");
            }
        }//End for loop for counter
        System.out.println();
    }



    }
}