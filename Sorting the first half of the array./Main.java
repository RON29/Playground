import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int a[]=new int[k];
    for(int i=0;i<k;i++)
      a[i]=sc.nextInt();
     //Arrays.sort(a, 1, n/2); 
    int n=k/2;
    for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(a[j-1] > a[j]){  
                                 //swap elements  
                                 int temp = a[j-1];  
                                 a[j-1] = a[j];  
                                 a[j] = temp;  
                         }  
                          
                 }  
    }
    
    for(int i=0;i<k;i++)
      System.out.print(a[i]+" ");
  }
}