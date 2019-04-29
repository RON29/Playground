import java.util.*;

class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();
      }
        
    }
    int c=0;
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        b[i][j]=sc.nextInt();
        if(b[i][j]-a[i][j]!=0)
          c++;
      }
        
    }
    if(c==0)
      System.out.println("Yes");
    else
      System.out.println("No");
      
  }
}