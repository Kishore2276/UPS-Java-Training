package scannerpractice;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		
		
		System.out.println("Enter your height:");
		float height = sc.nextFloat();
		
		
		System.out.println("Enter your weight:");
		float weight = sc.nextFloat();
		
		sc.nextLine();
		
		System.out.println("Enter your city:");
		String city = sc.nextLine();
		
		System.out.println("----Enter your bio data----");
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Height:" + height);
		System.out.println("Weight:" + weight);
		System.out.println("City:" + city);
		
		
		
		sc.close();
	}

}
