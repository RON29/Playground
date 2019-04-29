import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int a[]=new int[n];
    	for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();        
        }
    	int x=sc.nextInt();
    	for(int j=1;j<=x;j++)
        {
          int temp=a[0];
          int temp1=0;
          for(int i=0;i<n;i=i+2)
          {
            if(i+2<n)
            {
              temp1=a[i+2];
              a[i+2]=temp;
              temp=temp1;
            }
            else
              a[0]=temp;
          }
          temp=a[1];
          int i=1;
          for(i=1;i<n;i+=2)
          {
            if(i+2<n)
            	a[i]=a[i+2];
          }
          a[i-2]=temp;
        }
    	for(int i=0;i<n;i++)
          System.out.print(a[i]+" ");
        
  	}
}