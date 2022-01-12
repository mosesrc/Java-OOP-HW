
public class Calculator {

	static void add(int num1 , int num2) {
		System.out.println(num1 + num2);
	}
	
	static void subtraction(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	static void multiply(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	static void division(int num1, int num2) {
		System.out.println(num1 / num2);
	}
	
	static void square(int num1, int num2) {
		System.out.println(Math.pow(num1, num2));
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square(3, 3);
	}

}
