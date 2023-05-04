package app;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci il numero di partenza del conto alla rovescia: ");
		int number = scanner.nextInt();
		for (int index = number; index >= 0; index--) {
			System.out.println(number--);
		}
		scanner.close();

	}

}
