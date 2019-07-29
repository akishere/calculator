package calculate;

public class Calculator {
	
		public int x;
		public int y;
		
		public int add(int x,int y) {
			return (x+y);
		}
		public int subtract(int x,int y) {
			return(x-y);
		}
		public int multiply(int x,int y) {
			return(x*y);
			
		}
		public int divide(int x,int y) {
			return(x/y);
		}


public static void main(String[] args) {
	Calculator cal = new Calculator();
	System.out.println(cal.add(4, 4));
	System.out.println(cal.subtract(5, 3));
	System.out.println(cal.multiply(3, 4));
	System.out.println(cal.divide(4, 4));
}
}

