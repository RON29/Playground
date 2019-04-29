import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
       Scanner sc=new Scanner(System.in);
      String st=sc.nextLine();
      String s=st.toLowerCase();
      
      	//StringBuilder sb=new StringBuilder(s);  
        for(int i=0;i<s.length();i++)
        {
          char c=s.charAt(i);
          int count=0;
          for(int j=0;j<s.length();j++)
          {
            if(c==s.charAt(j))
          	{
            	if(j<i)
                  break;
              	else
                	count++;
                //sb.replace(j,j,"");
          	}
            
          }
	        if(count>0)
        	  System.out.print(c+""+count+" ");
          
          
        }
      
    }
}