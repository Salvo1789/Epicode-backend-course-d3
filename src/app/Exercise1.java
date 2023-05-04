package app;

public class Exercise1 {

	public static void main(String[] args) {
		String frase1 = "Pincopallo";
		String frase2 = "America";
		
		System.out.println("le due frasi sono pari?");
		System.out.println(frase1);
		System.out.println(stringaPariDispari(frase1));
		System.out.println(frase2);
		System.out.println(stringaPariDispari(frase2));
		
		
		int anno1 = 2020;
		int anno2 = 1947;
		
		System.out.println("I due anni sono bisestili?");
		System.out.println(anno1);
		System.out.println(annoBisestile(anno1));
		System.out.println(anno2);
		System.out.println(annoBisestile(anno1));

	}
	
	public static boolean stringaPariDispari(String phrase) {
		return (phrase.length()) % 2 == 0 ? true : false;
	}
	
	public static boolean annoBisestile(int year) {
		if (year % 400 == 0 ||!(year % 100 == 0 && year % 4 == 0)) {
			return true;
		}else {
			return false;
		}
	}
}
