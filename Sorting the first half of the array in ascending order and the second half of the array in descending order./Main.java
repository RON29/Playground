import java.util.Scanner;
import java.util.Arrays;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {  a[i]=sc.nextInt();}
    // Arrays.sort(a, 1, n/2); 
    
    int k=n/2;
    for(int i=0; i < k; i++){  
                 for(int j=1; j < (k-i); j++){  
                          if(a[j-1] > a[j]){  
                                 //swap elements  
                                 int temp = a[j-1];  
                                 a[j-1] = a[j];  
                                 a[j] = temp;  
                         }  
                          
                 }  
    }
    
   Arrays.sort(a, n/2, n); 
    int low = n/2, high = n-1; 
        while (low < high) 
        { 
            int temp = a[low]; 
            a[low] = a[high]; 
            a[high] = temp; 
            low++; high--; 
        }
    
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");
  }
}