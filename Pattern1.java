import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Rows : ");
      int Number=sc.nextInt();
      /*1)
      *
      **
      ***
      */
      //==========================
      for(int i=1;i<=Number;i++){
          for(int j=1;j<=i;j++){
              System.out.print(j);
          }
          System.out.println();
      }
      //==================
    }
  }