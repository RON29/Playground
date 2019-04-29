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
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();
      }
        
    }
    for(int i=0;i<m;i++)
    {
      int k=0;
      for(int j=i;j<n;j++)
      {
        System.out.print(a[k++][j]+" ");
      }
        
    }
  }
}