import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=(n/2)+1;i>=1;i--)
      {
        for(int j=(n/2)+1;j>i;j--)
          System.out.print(" ");
        for(int j=2*i-1;j>=1;j--)
        {
          if(j==2*i-1 || j==1)
            System.out.print("*");
          else
            System.out.print(" ");
        }
        
      System.out.println(" ");  
      }
      for(int i=2;i<=(n/2)+1;i++)      
      {
         for(int j=(n/2)+1;j>i;j--)
          System.out.print(" ");
        for(int j=1;j<=2*i-1;j++)
        {
           if(j==2*i-1 || j==1)
            System.out.print("*");
          else
            System.out.print(" ");
        }
              System.out.println(" ");  

      }
	}
}