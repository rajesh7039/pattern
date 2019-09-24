import java.util.*;
public class Main {
    public static void main(String args[]) {
      int i,j;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Rows : ");
      int Number=sc.nextInt();
       
      /*4)
        1
       21
      321
      */
      
      for(i=1;i<=Number;i++){
          for(j=Number;j>=1;j--){
              if(j<=i){
                  System.out.print(j+" ");
              }
              else{
                  System.out.print("  ");
              }
          }
          System.out.println();
      }
      
    }
  }