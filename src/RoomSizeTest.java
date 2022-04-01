
// import java scanner class
import java.util.Scanner;

public class RoomSizeTest {
	public static void main(String[] args) {
		// get user input
		Scanner input = new Scanner(System.in);
		
		double length;
		double width;
		String choice = "Y";
		//loop to continue
		while (choice != "N") {
			System.out.print("Enter Length: ");
			length = input.nextDouble();
			
			System.out.print("Enter Width: ");
			width = input.nextDouble();
			//prints results
			System.out.printf("Area: %f%n", area(length, width));
			System.out.printf("Perimeter: %f%n", perimeter(length, width));
			System.out.println("Enter \"Y\" to continue \"N\" to stop ");
			choice = input.next();
		}
		
	}
	public static double area(double length, double width) {
		return length * width;
	}
	public static double perimeter(double length, double width) {
		return (2 *length) +  (2 * width);
		
	}
	
}
