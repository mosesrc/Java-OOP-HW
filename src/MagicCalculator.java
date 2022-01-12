
public class MagicCalculator extends Calculator {
	static void squareRT(double num) {
		System.out.println(Math.sqrt(num));
	}
	
	static void sine(double num) {
		System.out.println(Math.sin(num));
	}
	
	static void cosine(double num) {
		System.out.println(Math.cos(num));
	}
	
	static void tang(double num) {
		System.out.println(Math.tan(num));
	}
	
	static void factorial(double num) {
		long result = 1;
		for(int i = 2; i <= num; num++) {
			result *= num;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
	}
}
