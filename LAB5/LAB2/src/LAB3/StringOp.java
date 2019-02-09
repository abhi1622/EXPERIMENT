package LAB3;
import java.lang.String;
import java.util.Scanner;

public class StringOp {

	public static void main(String[] args) {
		int a,b,i,j;
		String str=new String();
		String result=new String();
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		System.out.println("enter user choice of operation\n "
				+ "1.concate string"
				+ "2.replace odd with #"
				+"3.remove duplicate"+"4.change odd with uppercase");
		a=sc.nextInt();
		switch(a)
		{
		   case 1:
			   
			  str=str.concat(str);
			  System.out.println(str);
		      break;
		   case 2:
			   b=str.length();
			   for(i=0;i<b;i++)
			   {
				   if(i%2!=0)
				   {
					  str=str.substring(0,i-1)+"#"+str.substring(i,b);
					 
				   }
				   
				   
			   }
			  System.out.println(str);
		   break;
		   case 4:
			   for ( i = 0; i < str.length(); i++) {
			       char ch=str.charAt(i);
			   
			   
			   b=str.length();
			   for(i=0;i<b;i++)
			   {
			  
			   
			   
				   if(i%2==0)
				   {
					  System.out.println(ch);
					 
				   }
				   else
				   {
					   System.out.println(Character.toUpperCase(ch));
				   }
				   
			   }
		}		   
			   break;
		   case 3:
			   
					   
		         for (i = 0; i < str.length(); i++) {
						   
						   
					     if(!result.contains(String.valueOf(str.charAt(i)))) {
					            result += String.valueOf(str.charAt(i));
					        }
					    }
				   
		            
		            
		        

		        System.out.println(result);
			   break;
		   
		   default:
			   System.out.println("wrong choice entered");
			   break;
			   
		   
		   
		}
			 
			  
			  
			  
			  
		
		

	}

}
