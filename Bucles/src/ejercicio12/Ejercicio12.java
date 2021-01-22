package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = 0;

		int contador = 0;

		int contador2 = 0;

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

		// Hacemos un recorrido desde cero hasta el doble del numero introducido por el
		// usuario.
		for (int i = 0; i < n * 2; i += 2) {

			// Hacemos un recorrido desde el valor de repeticion del primer recorrido hasta
			// el doble del numero introducido por el usuario.
			for (int j = i; j < n * 2; j++) {

				System.out.print(" ");

			}

			// Hacemos un recorrido desde cero hasta el valor de repeticion del primer
			// recorrido.
			for (int j = 0; j < i + 1; j++) {

				// Si el valor de repeticion del recorrido "j" es menor o igual que el valor de
				// "contador".
				if (j <= contador2) {

					// Aumentamos mas uno el valor "contador".
					contador++;

					// Si el valor de repeticion del recorrido "j" es mayor que el valor de
					// "contador".
				} else {

					// Reducimos menos uno el valor "contador".
					contador--;

				}

				// Muestra por pantalla el valor de "contador" y un espacio en blanco.
				System.out.print(contador + " ");

			}

			// Reiniciamos a cero el valor de "contador".
			contador = 0;

			// Hacemos un salto de linea.
			System.out.println();

			// Aumentamos mas uno el valor "contador2".
			contador2++;

		}

		// Cerramos el escaner.
		scn.close();

	}

}
