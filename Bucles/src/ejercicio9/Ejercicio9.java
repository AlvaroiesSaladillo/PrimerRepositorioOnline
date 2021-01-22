package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		boolean salir = false;

		int n = 0;

		// Mientras que no podamos salir del bucle
		while (!salir) {

			// Muestra un mensaje por pantalla.
			System.out.println("Introduzca un numero");

			// Solicitamos al usuario que introduzca un numero.
			n = scn.nextInt();

			// Si el numero introducido por el usuario es menor que uno.
			if (n < 1) {

				// Muestra un mensaje por pantalla.
				System.out.println("El numero no tiene que ser negativo ni cero, intenta de nuevo.");

				// Si el numero introducido por el usuario es mayor que uno.
			} else {

				// Salimos del bucle
				salir = true;

			}

		}

		// Hacemos un recorrido desde cero hasta el numero introducido por el usuario
		for (int i = 0; i < n; i++) {

			// Hacemos un recorrido desde el valor del primer recorrido hasta el numero
			// introducido por el usuario menos uno
			for (int j = i; j < n - 1; j++) {

				// Muestra por pantalla un espacio en blanco.
				System.out.print(" ");

			}

			// Hacemos un recorrido desde cero hasta el valor del primer recorrido mas uno
			for (int j = 0; j < i + 1; j++) {

				// Muestra por pantalla el caracter "* ".
				System.out.print("* ");

			}

			// Hacemos un salto de linea.
			System.out.println();

		}

		// Cerramos el escaner.
		scn.close();

	}

}
