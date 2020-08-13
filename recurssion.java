import java.util.*;
public class recurssion {
	static void binary_conversion(int n) 
	{ 
	    
	    if (n > 1) 
	        binary_conversion(n/2); 
	  
	         System.out.print(n % 2); 
	} 
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
	 System.out.print("Enter the number : ");
	   int num = s.nextInt();
	   
	   System.out.print("The Binary Number of "+ num +" is : " ); 
	   binary_conversion(num);
		    
		  
		         
		

	}

}
