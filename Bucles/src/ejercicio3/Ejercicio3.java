package ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Random random = new Random();

		Scanner scn = new Scanner(System.in);

		int numero1 = 0;

		int numero2 = 0;

		int numeroAleatorio = 0;

		boolean salir = false;

		// Mientras que no podamos salir del bucle.
		while (!salir) {

			// Muestra por pantalla un mensaje.
			System.out.println("Introduzca el primer numero");

			// Solicitamos al usuario que introduzca un numero
			numero1 = scn.nextInt();

			// Muestra por pantalla un mensaje.
			System.out.println("Introduzca el segundo numero");

			// Solicitamos al usuario que introduzca un numero
			numero2 = scn.nextInt();

			// Si el segundo numero introducido por el usuario es menor que el primer numero
			// introducido por el usuario.
			if (numero2 < numero1) {

				// Salimos del bucle.
				salir = true;

				// Si el segundo numero introducido por el usuario es mayor que el ptimer numero
				// introducido por el usuario.
			} else {

				// Muestra por pantalla un mensaje.
				System.out.println(
						"El segundo numero introducido es mayor que el primer numero introducido, intenta de nuevo");

			}

		}

		// Hacemos un recorrido desde cero hasta quince
		for (int i = 0; i <= 15; i++) {

			// Elegimos aleatoriamente un numero desde el primer numero introducido por el
			// usuario, hasta el segundo numero introducido por el usuario
			numeroAleatorio = random.nextInt((numero1 - numero2) + 1) + numero2;

			// Muestra un mensaje por pantalla
			System.out.println(numeroAleatorio);

		}

		// Cerramos el escaner.
		scn.close();

	}

}
