import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]<a[j])
        {
          int c=0;
          for(int k=i+1;k<j;k++)
          {
            if(a[k]>a[j])
              c++;
          }
          if(c==0)
            System.out.println(a[i]+","+a[j]);
        }
      }
    }
  }
}