package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int contador = 0;
		int n1 = 0;
		int n2 = 0;
		int i = 0;
		boolean salir = false;

		while (!salir) {

			// Solicitamos al usuario que introduzca el primer numero
			System.out.println("Introduzca el primer numero");
			n1 = scn.nextInt();

			// Solicitamos al usuario que introduzca el segundo numero
			System.out.println("Introduzca el segundo numero");
			n2 = scn.nextInt();

			// Si el primer numero introducido por el usuario es mayor que el segundo numero
			// introducido por el usuario
			if (n1 > n2) {

				// Muestra un mensaje por pantalla
				System.out.println(
						"El primer numero introducido es mayor que el segundo numero introducido, intenta de nuevo");

				// Si el primer numero introducido por el usuario es menor que el segundo numero
				// introducido por el usuario
			} else {

				// Salimos del bucle.
				salir = true;

			}

		}

		// Muestra un mensaje por pantalla
		System.out.println("Metodo while: ");

		// Ininiamos el valor de "i" como el primer numero introducido por el usuario
		i = n1;

		// Mientras que el valor de i es menor que el segundo numero introducido por el
		// usuario
		while (i <= n2) {

			// Si el resto del valor de i dividido por dos es igual a cero.
			if (i % 2 == 0) {

				// Muestra un mensaje por pantalla
				System.out.println(i);
				// Aumentamos a mas uno el valor de "contador".
				contador++;

			}

			// Aumentamos a mas uno el valor de "i".
			i++;

		}

		// Muestra un mensaje por pantalla
		System.out.println("El numero total de numeros pares es: " + contador);

		// Muestra un mensaje por pantalla
		System.out.println("Metodo do-while");

		// Reiniciamos el valor "contador" a cero.
		contador = 0;
		// Reiniciamos el valor de "i" como el primer numero introducido por el usuario.
		i = n1;

		// Mientras que el valor de i es menor que el segundo numero introducido por el
		// usuario
		do {

			// Si el resto del valor de i dividido por dos es igual a cero.
			if (i % 2 == 0) {

				// Muestra un mensaje por pantalla
				System.out.println(i);
				// Aumentamos a mas uno el valor de "contador".
				contador++;

			}

			// Aumentamos a mas uno el valor de "i".
			i++;

		} while (i <= n2);

		// Muestra un mensaje por pantalla
		System.out.println("El numero total de numeros pares es: " + contador);

		// Muestra un mensaje por pantalla
		System.out.println("Metodo for: ");

		// Reiniciamos el valor "contador" a cero.
		contador = 0;

		// Hacemos un recorrido desde el primer numero introducido por el usuario
		for (int q = n1; q <= n2; q++) {

			// Si el resto de "q" dividido entre dos es igual a cero
			if (q % 2 == 0) {

				// Muestra un mensaje por pantalla.
				System.out.println(q);
				// Aumentamos a mas uno el valor de "contador".
				contador++;

			}

		}

		// Muestra por pantalla un mensaje
		System.out.println("El numero total de numeros pares es: " + contador);

		// Cerramos el escaner.
		scn.close();

	}
	
	public void metodo1() {
		
	}

}
