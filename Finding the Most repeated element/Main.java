import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	a[i]=sc.nextInt();
      }
      int count=0;
      int count1=1;
      int x=0;
      int x1=a[0];
      for(int i=1;i<n;i++)
      {
        
        if(a[i]!=x1)
        {
          if(count1>count)
          {
            count=count1;
            x=x1;
          }
          count1=1;
          x1=a[i];
          
        }
        else
          count1++;
      }
      if(count1>count)
      {
        count=count1;
        x=x1;
      }
      System.out.print(x);
    
  }
}