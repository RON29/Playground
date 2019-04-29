import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int max=0;
    int mi=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      if(max<a[i])
      {
        max=a[i];
        mi=i;
      }
    }
    System.out.println(mi);
      
  }
}