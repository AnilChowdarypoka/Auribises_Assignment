
public class BitwiseNeg {

	public static void main(String[] args) {
		
		 int a = 6;        
		 int b = -6;    
		 int c = 0;
	      System.out.println("Binary value of 6  = " + Integer.toBinaryString(a));
	      System.out.println("Binary value of -6= " + Integer.toBinaryString(b));
	      c = a >>> 1;            
	      System.out.println(" 6   >>> 1 = " + Integer.toBinaryString(c));
	      c = b >> 1;              
	      System.out.println("-6 >> 1  = " + Integer.toBinaryString(c));
	      c = b >>> 1;            
	      System.out.println("-6 >>> 1 = " + Integer.toBinaryString(c));

	}

}
