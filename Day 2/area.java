import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectange:");
		int length = sc.nextInt();
		
		System.out.println("Enter the breadth of the rectange:");
		int breadth = sc.nextInt();
		
		System.out.println("Enter the side of the square:");
		int side = sc.nextInt();
		
		int Rectanglearea = length * breadth;
		int Squarearea = side * side;
		
		System.out.println("The area of rectangle is:" + Rectanglearea);
		System.out.println("The area of square is:" + Squarearea);
		
		sc.close();

	}

}
