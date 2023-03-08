package guiaN2;

import java.util.Scanner;

public class ejercicioN3 {

	public static void main(String[] args) {
		String frase;
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese una frase");
		frase = leer.nextLine();
		System.out.println("su frase en MAYUSCULAS es " + frase.toUpperCase());
		System.out.println("su frase en MINUSCULAS es " + frase.toLowerCase());

	}

}
