import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner miles_input = new Scanner(System.in);
		double miles;
		double kilometers;
		System.out.println("\n\t\tKilolab\n");
		System.out.print("Type miles: ");
		miles = miles_input.nextDouble();
		System.out.println("Convertating...");
		kilometers = miles * 1.609;
		System.out.println("Kilometers: " + kilometers + " [approximate]");
		System.out.println("\nThanks for using!\nFollow my GitHub page: TheTailsModder");
	}
}
