
public class ex502 {

	public static double add(double a, double b) {
		return a + b;
		
	}
	public static double sub(double a, double b) {
		return a - b;
		
	}
	public static double mult(double a, double b) {
		return a * b;
		
	}
	public static double div(double a, double b) {
		return a / b;
		
	}
	public static double max(double a, double b) {
		if(a >= b) return a;
		else return b;
	}
	public static double min(double a, double b) {
		if(a <= b) return a;
		else return b;
	}
	
	public static void factorial(int a) {
		int result = a;
		for (int i = 1; i<= a; i++ ) {
			result *=i;
		}
	    System.out.println("factorial of" + a + "!" + result);
	}
	public static void circ(int a) {
		System.out.println("pizza circ:" + 2 * a * 3.1415792 +"inches: " );
	}
	
	public static void circ(double a) {
		System.out.println("pizza circ:" + 2 * a * 3.1415792 +"inches: " );
	}
	
	public static void area(int a) {
		String result = "pizza area:" + a * a * 3.1415792 + "inches";
		System.out.println(result);
	}
	
	public static void area(double a) {
		String result = "pizza area:" + a * a * 3.1415792 + "inches";
		System.out.println(result);
	}
	
	
	
	public static void main(String[] args) {
		int a = 15;
		int b = 7;
	
	    factorial(a);
	    factorial(b);
	
	
	System.out.println("Calclator program");
	System.out.println("Add:"+ a + "+" + b + "=" + add(a,b));
	System.out.println("Subtract:" + a + "-" + b + "=" +sub(a,b));
	System.out.println("Multiply:" + a + "*" + b + "=" + mult(a,b));
	System.out.println("Divide:" + a + "/" + b + "=" + div(a,b));
	
	System.out.println("max(" + a + "," + b + "):" + max(a,b));
	System.out.println("min(" + a + "," + b + "):" + min(a,b));
	
	//Cirecle (pizza)계산
	
	circ(a);
	area(a);
	
	circ(12);  //int 매게변수
	circ(1.12345); //double 매ㄱ변수
	
	float c = 12.345f;
	circ(c);     
	


	}

}
