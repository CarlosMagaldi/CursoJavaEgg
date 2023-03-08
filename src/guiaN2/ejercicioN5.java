package guiaN2;

import java.util.Scanner;

public class ejercicioN5 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese un numero entero");
		int num = leer.nextInt();

		System.out.println("el doble del numero es " + num * 2
				+ " el triple es " + num * 3 + " y su raiz cuadrada es "
				+ Math.sqrt(num));

	}

}
