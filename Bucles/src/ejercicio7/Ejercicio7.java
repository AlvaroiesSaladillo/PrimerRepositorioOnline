package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int numTotalAlumnos = 0;

		int nota = 0;

		int numDeficiente = 0;

		int numInsuficiente = 0;

		int numAprobado = 0;

		int numBien = 0;

		int numNotable = 0;

		int numSobresaliente = 0;

		boolean salir = false;

		// Muestra por pantalla un mensaje
		System.out.println("Introduzca el numero total de alumnos");
		// Solicitamos al usuario que introduzca un numero.
		numTotalAlumnos = scn.nextInt();

		// Hacemos un recorrido desde cero
		for (int i = 0; i < numTotalAlumnos; i++) {

			// Mientras que no podamos salir del bucle.
			while (!salir) {

				// Muestra por pantalla un mensaje
				System.out.println("Introduzca una nota");
				// Solicitamos al usuario que introduzca un numero
				nota = scn.nextInt();

				// Si el numero introducido por el usuario esta entre 0 y 10
				if ((nota >= 0) && (nota <= 10)) {

					// Salimos del bucle
					salir = true;

					// Si el numero introducido por el usuario es menor que cero o es mayor que diez
				} else {

					// Muestra un mensaje por pantalla
					System.out.println("La nota introducida esta fuera de rango, intenta de nuevo");

				}

			}

			// Si el numero introducido por el usuario es menor e igual que dos
			if (nota <= 2) {

				// Aumentamos a mas uno el valor "numDeficiente".
				numDeficiente++;

				// Si el numero introducido por el usuario es menor e igual que cuatro
			} else if (nota <= 4) {

				// Aumentamos a mas uno el valor "numInsuficiente".
				numInsuficiente++;

				// Si el numero introducido por el usuario igual que cinco.
			} else if (nota == 5) {

				// Aumentamos a mas uno el valor "numAprobado".
				numAprobado++;

				// Si el numero introducido por el usuario es menor e igual que seis.
			} else if (nota == 6) {

				// Aumentamos a mas uno el valor "numBien".
				numBien++;

				// Si el numero introducido por el usuario es menor e igual que ocho.
			} else if (nota <= 8) {

				// Aumentamos a mas uno el valor "numNotable".
				numNotable++;

				// Si el numero introducido por el usuario es menor e igual que nueve.
			} else if (nota <= 10) {

				// Aumentamos a mas uno el valor "numSobresaliente".
				numSobresaliente++;

			}

		}

		// Muestra por pantalla un mensaje.
		System.out.println("Numero de alumnos de nota eficiente: " + numDeficiente);

		// Muestra por pantalla un mensaje.
		System.out.println("Numero de alumnos de nota insuficiente: " + numInsuficiente);

		// Muestra por pantalla un mensaje.
		System.out.println("Numero de alumnos de nota aprobado: " + numAprobado);

		// Muestra por pantalla un mensaje.
		System.out.println("Numero de alumnos de nota bien: " + numBien);

		// Muestra por pantalla un mensaje.
		System.out.println("Numero de alumnos de nota notable: " + numNotable);

		// Muestra por pantalla un mensaje.
		System.out.println("Numero de alumnos de nota sobresaliente: " + numSobresaliente);

		// Cerramos el escaner
		scn.close();
	}

}
