import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	a[i]=sc.nextInt();
      }
      int count=0;
      int count1=0;
      for(int i=0;i<n;i++)
      {
        
        if(a[i]==0)
        {
          if(count1>count)
          {
            count=count1;
            
          }
          count1=0;
          
        }
        else
          count1++;
      }
      if(count1>count)
        count=count1;
      System.out.print(count);
    }
}