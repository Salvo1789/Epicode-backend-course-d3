package app;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci un intero: ");
		int num = scanner.nextInt();
		switch(num) {
		case 0:
			System.out.println("Zero");
		break;
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Due");
			break;
		case 3:
			System.out.println("Tre");
			break;
		
		default:
			System.out.println("Numero non accettato");
			break;
		}
		scanner.close();
	}

}
