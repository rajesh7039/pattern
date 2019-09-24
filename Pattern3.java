import java.util.*;
public class Main {
    public static void main(String args[]) {
      int i,j;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Rows : ");
      int Number=sc.nextInt();
    
      /*3)
      1
      23
      456
      */
      int k=1;
      for(i=1;i<=Number;i++){
          
          for(j=1;j<=i;j++){
            
            System.out.print(k);
            k++;
          }
          System.out.println();
      }
      
    }
  }