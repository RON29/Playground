import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    int a[][]=new int[m][n];
    int b[][]=new int[m][n];
    for(int i=0;i<m;i++)
    {
      for(int j=n-1;j>=0;j--)
      {
        a[j][i]=sc.nextInt();
      }
        
    }
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
        System.out.print(a[i][j]+" ");
      System.out.println();
    }
  }
}