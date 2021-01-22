package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		boolean salir = false;

		int n1 = 0;

		int n2 = 0;

		// Mientras que no podamos salir del bucle.
		while (!salir) {

			// Muestra un mensaje por pantalla.
			System.out.println("Introduzca el primer numero");

			// Solicitamos al usuario que introduzca un numero
			n1 = scn.nextInt();

			// Muestra un mensaje por pantalla
			System.out.println("Introduzca el segundo numero");

			// Solicitamos al usuario que introduzca un numero
			n2 = scn.nextInt();

			// Si el primer numero introducido por el usuario es mayor que el segundo numero
			// introducido por el usuario.
			if (n1 > n2) {

				// Muestra un mensaje por pantalla
				System.out.println(
						"El primer numero introducido es mayor que el segundo numero introducido, intenta de nuevo.");

				// Si el primer numero introducido por el usuario es menor que el segundp numero
				// introducido por el usuario
			} else {

				// Salimos del bucle
				salir = true;

			}

		}


		// Si el valor de i es menor que j, hacemos un recorrido por cada doble de i y
		// por cada mitad de j.
		for (int i = n1, j = n2; i < j; i *= 2, j /= 2) {

			// Muestra el valor de i.
			System.out.println(i);

			// Muestra el valor de j.
			System.out.println(j);

		}

		// Cerramos el escaner
		scn.close();

	}

}
