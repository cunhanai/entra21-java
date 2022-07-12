
import java.util.Scanner;

public class Util {
	
	public static void imprima(int numero) {
		System.out.println(numero);
	}
	
	public static void imprima(char numero) {
		System.out.println(numero);
	}
	
	public static void imprima(String texto) {
		System.out.println(texto);
	}
	
	public static int leia() {
		Scanner in = new Scanner(System.in);
		return in.nextInt();
	}

	
}
