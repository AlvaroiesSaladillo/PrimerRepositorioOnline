package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int factor1 = 0;

		int factor2 = 0;

		int producto = 0;

		boolean salir = false;

		// Mientras que no podamos salir del bucle.
		while (!salir) {

			// Muestra por pantalla un mensaje al usuario
			System.out.println("Introduzca el primer factor");

			// Solicitamos al usuario que introduzca un numero.
			factor1 = scn.nextInt();

			// Muestra por pantalla un mensaje al usuario
			System.out.println("Introduzca el segundo factor");

			// Solicitamos al usuario que introduzca un numero.
			factor2 = scn.nextInt();

			// Si el primer numero introducido por el usuario es menor que cero o el segundo
			// numero introducido por el usuario es menor que cero
			if ((factor1 < 0) || (factor2 < 0)) {

				// Muestra un mensaje por pantalla
				System.out.println("El primer o segundo factor introducido es negativo, intenta de nuevo");

				// Si el primer numero introducido por el usuario y el segundo numero
				// introducido por el usuario son mayores que -1.
			} else {

				// Salimos del bucle.
				salir = true;

			}

		}

		// Hacemos un recorrido desde cero hasta el segundo numero introducido por el
		// usuario
		for (int i = 0; i < factor2; i++) {

			// Sumamos el valor producto mas el primero valor introducido por el usuario.
			producto += factor1;

		}

		// Muestra por pantalla un mensaje al usuario.
		System.out.println("El producto de " + factor1 + "*" + factor2 + " es: " + producto);

		// Cerramos el escaner.
		scn.close();

	}

}
