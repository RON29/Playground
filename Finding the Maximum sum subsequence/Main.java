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
    int sum=0;
    int sum1=0;
    for(int i=0;i<n-1;i++)
    {        
      sum1+=a[i];
      
      if(a[i+1]<a[i])
      { 
        
        if(sum1>sum)
          sum=sum1;
        sum1=0;
      }
     
    }
    if(a[n-1]<a[n-2])
    {
      sum1=a[n-1];
    }
    else
      sum1+=a[n-1];
    if(sum1>sum)
      sum=sum1;
    System.out.println(sum);
  }
}