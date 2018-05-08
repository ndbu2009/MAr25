package demo;

public class Calculator { 
	
	public void add(int a, int b) {//a and b are called formal parameters
		System.out.println(a+b);
	}
	
	public void subtract(int a, int b) {
		System.out.println(a-b);
	}
	public void multiply(int a, int b) {
		System.out.println(a*b);
		
		// added comments on line 15
	}
	public void divide(int a, int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		
		basicCal.add(10, 20); // 10 and 20 are known as actual parameters
		basicCal.subtract(30,20);
		basicCal.multiply(5, 4);
		basicCal.divide(100, 20);
		
	}

}
