package LAB3;
import java.util.Scanner;

public class Stringpos {

	public static void main(String[] args) {
		int i;
		int n=0;
		String str=new String();
		System.out.println("enter  string");
		Scanner sc=new Scanner(System.in);
		str= sc.next();
		
		
	
		for(i=0;i<str.length();i++)
		{
		  if(str.charAt(i)<str.charAt(i+1))
		  { 
			  n=0;
		  }
		 
		  else
			  n=1;
			  break;
			
			
		}
		
       if(n==1)
    	   System.out.println("FALSE");
       else
    	   System.out.println("True");
   	}

}
