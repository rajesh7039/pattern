import java.util.*;
public class Main {
    public static void main(String args[]) {
      int i,j;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Rows : ");
      int Number=sc.nextInt();
      
      /*8)
      *
      **
      ***
      */
      for(i=1;i<=Number;i++){
          for(j=Number-1;j>=i;j--){
              System.out.print(" ");
          }
          for(int k=1;k<=(2*i)-1;k++){
              System.out.print(k);
          }
          System.out.println();
      }

    }
  }