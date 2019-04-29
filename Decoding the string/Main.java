import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int n=sc.nextInt();
    String s1="";
    for(int i=0;i<s.length();i++)
    {
      char c=s.charAt(i);
      if(c>=65 && c<=90)
      {
        if((c-n)<65)
      	{
        	int x=c-65;
      		x=90-(n-x)+1;
      		c=(char)x;
      	}
      	else
        	c=(char)(c-n);
      
      	//s1=s1+c;
      
      }
      else if(c>=97 && c<=122)
      {
        if((c-n)<97)
      	{
        	int x=c-97;
      		x=122-(n-x)+1;
      		c=(char)x;
      	}
      	else
        	c=(char)(c-n);
      }
        
      s1+=c;
      
    }
    System.out.println(s1);
  }
}