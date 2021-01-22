package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int sumPares = 0;
		int sumImpares = 0;
		boolean salir = false;

		// Mientras que no podamos salir del bucle.
		while (!salir) {

			// Muestra por pantalla un mensaje.
			System.out.println("Introduzca el primer numero");

			// Solicitamos al usuario que introduzca un numero.
			n1 = scn.nextInt();

			// Muestra por pantalla un mensaje.
			System.out.println("Introduzca el segundo numero");

			// Solicitamos al usuario que introduzca un numero.
			n2 = scn.nextInt();

			// Si el primer numero introducido por el usuario es menor que el segundo numero
			// introducido por el usuario
			if (n1 < n2) {

				// Salimos del bucle
				salir = true;

				// Si el primer numero introducido por el usuario es mayor que el segundo numero
				// introducido por el usuario
			} else {

				System.out.println("El numero " + n1 + " es mayor que " + n2 + " intenta de nuevo");

			}

		}

		// Hacemos un recorrido desde el primer numero introducido por el usuario hasta
		// el segundo numero introducido por el usuario.
		for (int i = n1; i < n2; i++) {

			// Si el resto del valor de repeticiones del recorrido entre dos es igual a
			// cero.
			if (i % 2 == 0) {

				// Aumentamos el valor de "sumPares" mas el valor de repeticiones del recorrido.
				sumPares += i;

				// Si el resto del valor de repeticiones del recorrido entre dos no es igual a
				// cero.
			} else {

				// Aumentamos el valor de "sumImpares" mas el valor de repeticiones del
				// recorrido.
				sumImpares += i;

			}

		}

		// Muestra un mensaje por pantalla
		System.out.println("La suma total de los numeros pares es: " + sumPares);

		// Muestra un mensaje por pantalla
		System.out.println("La suma total de los numeros impares es: " + sumImpares);

		// Cerramos el escaner.
		scn.close();
	}

}
