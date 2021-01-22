package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = 0;

		boolean salir = false;

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

		////////////////////////////////

		// Hacemos un recorrido desde cero hasta el numero introducido por el usuario.
		for (int i = 0; i < n; i++) {

			// Hacemos un recorrido desde el el valor de repeticion del recorrido hasta el
			// numero introducido por el usuario.
			for (int j = i; j < n; j++) {

				// Muestra por pantalla un caracter en blanco.
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

		///////////////////////////////////////////

		// Hacemos un recorrido desde el numero introducido por el usuario menos uno
		// hasta cero.
		for (int i = n - 1; i > 0; i--) {

			// Hacemos un recorrido desde el el valor de repeticion del recorrido hasta el
			// numero introducido por el usuario mas uno.
			for (int j = i; j < n + 1; j++) {

				// Muestra por pantalla un espacio en blanco.
				System.out.print(" ");

			}

			// Hacemos un recorrido desde cero hasta el valor del primer recorrido.
			for (int j = 0; j < i; j++) {

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
