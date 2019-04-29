import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int k=n-1;
      int i=0;
      int f=0;
      while(i<=k)
      {
        if(a[k]!=a[i])
        {
          f=1;
          break;
        }
        i++;
        k--;
      }
      if(f==1)
        System.out.println("No");
      else
        System.out.println("Yes");
    }
}