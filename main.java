import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner miles_input = new Scanner(System.in);
		double miles;
		double kilometers;
		System.out.println("\n\t\tKilolab\n");
		System.out.print("Введите мили: ");
		miles = miles_input.nextDouble();
		System.out.println("Конвертация...");
		kilometers = miles * 1.609;
		System.out.println("Километров: " + kilometers);
		System.out.println("\nСпасибо за использование!\nСледи за моей страницей на GitHub: ftvTails");
	}
}