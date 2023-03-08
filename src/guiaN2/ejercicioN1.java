package guiaN2;

import java.util.Scanner;

public class ejercicioN1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		int n1, n2, suma;

		System.out.println("ingrese el primer numero");
		n1 = leer.nextInt();

		System.out.println("ingrese el segundo numero");
		n2 = leer.nextInt();

		suma = n1 + n2;

		System.out.println("la suma es " + suma);
	}

}
