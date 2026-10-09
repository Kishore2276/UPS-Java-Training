import java.util.Scanner;

public class arithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter your second number:");
		int b = sc.nextInt();
		
		int sum = a + b;
		int mul = a * b;
		int sub = a - b;
		
		System.out.println("Addition:" + sum);
		System.out.println("Subtraction:" + sub);
		System.out.println("Multiplication:" + mul);
		
	}
}
