package guiaN2;

import java.util.Scanner;

public class ejercicioN4 {

	public static void main(String[] args) {
		double c, f;
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese la temperatura en grados centigrados");
		c = leer.nextDouble();
		f = 32 + (9 * c / 5);

		System.out.println("el equivalente en grados Fahrenheit es " + f);

	}

}
