package app;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase = "";
		do{
		System.out.print("Inserisci una frase: ");
		frase = scanner.nextLine();
		int i = 0;
		while(!(frase.equals(":q")) && i<frase.length()) {
			if (i != frase.length() -1) {
			System.out.print(frase.charAt(i) + ",");
			}else {
				System.out.println(frase.charAt(i));	
			}
			i++;
		};
		}while( frase != ":q");
		scanner.close();
	}

}
