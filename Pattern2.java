import java.util.*;
public class Main {
    public static void main(String args[]) {
      int i,j;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Rows : ");
      int Number=sc.nextInt();
      
      /*2)
      1
      12
      123
      */
      
      for(i=1;i<=Number;i++){
          int k=1;
          for(j=1;j<=i;j++){
            
            System.out.print(k);
            k++;
          }
          System.out.println();
      }
      
  }
}