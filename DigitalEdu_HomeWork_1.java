import java.util.Scanner;
public class DigitalEdu_HomeWork_1 {
	public static void main(String[] args) {
		
// 		Add, Subtract, Myltiply and Divide two input numbers
		
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.print("Enter first number: ");
		a = scan.nextInt();
		System.out.print("Enter second number: ");
		b = scan.nextInt();
		
		int resultAdd = add(a,b);
		System.out.println(""+a+" + "+b+" = "+resultAdd+"");
		
		int resultSub = subtract(a,b);
		System.out.println(""+a+" - "+b+" = "+resultSub+"");
		
		int resultMult = multiply(a,b);
		System.out.println(""+a+" * "+b+" = "+resultMult+"");
		
		int resultDiv = divide(a,b);
		System.out.println(""+a+" / "+b+" = "+resultDiv+"");
		
	}
	private static int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	private static int subtract(int x, int y) {
		int z = x - y;
		return z;
	}
	
	private static int multiply(int x , int y) {
		int z = x * y;
		return z;
	}
	
	private static int divide(int x, int y) {
		int z = x / y;
		return z;
	}

}
