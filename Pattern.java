import java.util.*;
public class Main {
    public static void main(String args[]) {
      int i,j;
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Rows : ");
      int Number=sc.nextInt();
      
      /*1)
      *
      **
      ***
      */
      /*for(i=1;i<=Number;i++){
          for(j=1;j<=i;j++){
              System.out.print(j);
          }
          System.out.println();
      }*/
      
      /*2)
      1
      12
      123
      */
      
      /*for(i=1;i<=Number;i++){
          int k=1;
          for(j=1;j<=i;j++){
            
            System.out.print(k);
            k++;
          }
          System.out.println();
      }*/
      
      
      /*3)
      1
      23
      456
      */
      /*int k=1;
      for(i=1;i<=Number;i++){
          
          for(j=1;j<=i;j++){
            
            System.out.print(k);
            k++;
          }
          System.out.println();
      }*/
      
      
      /*4)
        *
       **
      ***
      */
      
      /*for(i=1;i<=Number;i++){
          for(j=Number-1;j>=i;j--){
            System.out.print(" ");
          }
          for(int k=1;k<=i;k++){
            System.out.print("*");
          }
          System.out.println();
      }*/
      
      /*5)
        1
       21
      321
      */
      /*for(i=1;i<=Number;i++){
          for(j=Number-1;j>=i;j--){
            System.out.print(" ");
          }
          for(int k=i;k>0;k--){
            System.out.print(k);
          }
          System.out.println();
      }*/
      
      /*6)
        1
       12
      123
      */
      /*for(i=1;i<=Number;i++){
          for(j=Number-1;j>=i;j--){
            System.out.print(" ");
          }
          for(int k=1;k<=i;k++){
            System.out.print(k);
          }
          System.out.println();
      }*/
      
      /*7)
        1
       23
      456
      */
      /*int val=1;
      for(i=1;i<=Number;i++){
          for(j=Number-1;j>=i;j--){
            System.out.print(" ");
          }
          for(int k=1;k<=i;k++){
            
            System.out.print(val);
            val++;
          }
          System.out.println();
      }*/
      
      
      /*8)
      *
      **
      ***
      */
      /*for(i=1;i<=Number;i++){
          for(j=Number-1;j>=i;j--){
              System.out.print(" ");
          }
          for(int k=1;k<=(2*i)-1;k++){
              System.out.print(k);
          }
          System.out.println();
      }*/
      
      
      /*9)
      Repeat Horizontal
      *
      **
      ***
      **
      *
      
      */
    /*System.out.print("Enter Counter : ");
    int Counter=sc.nextInt();
    for(i=1;i<=Number;i++){
        for(j=i;j<Number;j++){
            System.out.print(" ");
        }
        for(int k=1;k<2*i;k++){
            System.out.print("*");
        }
        
        for(int c=1;c<=Counter;c++){
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
        
        for(int c=1;c<=Counter;c++){
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
    }*/
    
    

      /*10)
      Repeat Horizontal
      *
      **
      ***
      **
      *
      
      */
    System.out.print("Enter Counter : ");
    int Counter=sc.nextInt();
    for(int s=1;s<=Counter;s++){
    for(i=1;i<=Number;i++){
        for(j=i;j<Number;j++){
            if(s>1 & i==1){
                    System.out.print("");
                }
                else{
                System.out.print("  ");
                }
        }
        for(int k=1;k<2*i;k++){
            if(s>1 & i==1){
                    System.out.print("");
                }
                else{
            System.out.print(i+" ");
                }
        }
        
        for(int c=1;c<Counter;c++){
            for(j=i;j<Number;j++){
                if(s>1 & i==1){
                    System.out.print("");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(j=i;j<Number-1;j++){
                if(s>1 & i==1){
                    System.out.print("");
                }
                else{
                System.out.print("  ");
                }
            }
            for(int k=1;k<2*i;k++){
                if(k==i & k==Number){
                    System.out.print("");
                }
                else{
                    if(s>1 & i==1){
                    System.out.print("");
                }
                else{
                    System.out.print(i+" ");
                }
                    
                }
            }
        }//End for loop for counter
       if(s>1 & i==1){
                    System.out.print("");
                }
                else{
        System.out.println();
                }
    }
    for(i=Number-1;i>=1;i--){
        for(j=Number;j>i;j--){
            System.out.print("  ");
        }
        for(int k=1;k<(i*2);k++){
            
            System.out.print(i+" ");
        }
        
        for(int c=1;c<Counter;c++){
            for(j=Number;j>i;j--){
                System.out.print("  ");
            }
            for(j=Number-1;j>i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<(i*2);k++){
                System.out.print(i+" ");
            }
        }//End for loop for counter
        System.out.println();
    }
    }
      

    }
}










//new work
//========
import java.util.*;
public class Main
{
  public static void main (String args[])
  {
    int i, j;
    Scanner sc = new Scanner (System.in);
    System.out.print ("Enter Rows : ");
    int Number = sc.nextInt ();
    System.out.print ("Enter Counter : ");
    int Counter = sc.nextInt ();

    if(Number==1){
        for(int y=1;y<=Counter;y++)
        {
            for(int z=1;z<=Counter;z++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    else
    {
        for(int rct=1;rct<=Counter;rct++)// main loop to make square Repeat
        {
            for(i=1;i<=Number;i++) // start upside code
            { 
                if(rct>1 & i==1){
                    System.out.print("");
                }
                else{
                    for(j=i;j<Number;j++){
                        System.out.print("  ");
                    }
                    for(int k=1;k<2*i;k++){
                        System.out.print("* ");
                    }
                    for(j=i;j<Number;j++){
                        System.out.print("  ");
                    }
                }
                
                for(int cnt=1;cnt<=Counter-1;cnt++) // For Loop For making Repeatation of code
                {
                    if(rct>1 & i==1){
                        System.out.print("");
                    }
                    else{
                        for(j=i;j<Number-1;j++)
                        {
                            System.out.print("  ");
                        }
                        for(int k=1;k<2*i;k++)
                        {
                            if(k==Number & i==Number){
                                System.out.print("");
                            }
                            else{
                                System.out.print("* ");
                            }
                        }
                        for(j=i;j<Number;j++)
                        {
                            System.out.print("  ");
                        }
                    }
                }
                
                if(rct>1 & i==1){
                    System.out.print("");
                }
                else{
                    System.out.println();
                }
            }// End upside code
    
    
    
    
    
        
            //down side code
            for(i=Number-1;i>=1;i--)
            {
                for(j=Number;j>i;j--){
                    System.out.print("  ");
                }
                for(int k=1;k<(i*2);k++)
                {
                    System.out.print("* ");
                }
                for(j=Number;j>i;j--){
                    System.out.print("  ");
                }
                for(int cnt=1;cnt<=Counter-1;cnt++) // For Loop For making Repeatation of code
                {
                    for(j=Number-1;j>i;j--){
                        System.out.print("  ");
                    }
                    for(int k=1;k<(i*2);k++){
                        System.out.print("* ");
                    }
                    for(j=Number;j>i;j--){
                        System.out.print("  ");
                    }
                }    
                System.out.println();
            }//End down side code
            
            
        }// End main loop to make square Repeat
    }//End if condition


  }
}
