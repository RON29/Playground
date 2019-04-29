import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int a[]=new int[n];
    	int b[]=new int[n];
      	for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();        
        }
      	int k=0;
      	for(int i=0;i<n;i++)
        {
          if(a[i]!=0)
            b[k++]=a[i];
        }
      	for(int i=k;i<n;i++)
        {
          b[k++]=0;
        }
      	for(int i=0;i<n;i++)
        {
          System.out.print(b[i]+" ");
        }
    }
}