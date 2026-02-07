public class Calculator {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	
	public static int square(int a) {
		return a * a;
	}
	
	
	// Using main method
	
	public static void main(String[] args) {
		
		//( 3 * 4 + 5 * 7) ^ 2
	      
		  int m1 = multiply(3,4);
		  int m2 = multiply (5,7);
		  int sum1 = add(m1,m2);
		  int result1 = square(sum1);
		  
		  System.out.println(result1);
		  
		  // (4 + 7)^2 + (8 + 3)^2
		  
		  int s1 = add(4, 7);
		  int sq1 = square(s1);
		  
		  int s2 = add(8, 3);
		  int sq2 = square(s2);
		  
		  int result2 = add(sq1, sq2);
		  
		  System.out.println(result2);
	}
}