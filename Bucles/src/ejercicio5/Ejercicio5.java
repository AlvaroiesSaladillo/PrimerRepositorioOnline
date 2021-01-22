package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		boolean salir = false;

		int numero = 0;

		int resultado = 0;

		// Mientras que no podamos salir del bucle.
		while (!salir) {
			
			// Muestra un mensaje por pantalla
			System.out.println("Introduzca un numero entre 0 y 10");
			
			// Solicitamos al usuario que introduzca un numero
			numero = scn.nextInt();

			// Si el numero es mayor o igual que cero y es menor e igual que cero
			if ((numero >= 0) && (numero <= 10)) {
				
				// Salimos del bucle.
				salir = true;

			} else {
				// Muestra por pantalla un mensaje
				System.out.println("El numero tiene que estar entre 0 y 10, intenta de nuevo");

			}

		}
		// Muestra un mensaje por pantalla
		System.out.println("Tabla de multiplicar de " + numero);

		// Hacemos un recorrido desde cero hasta 10.
		for (int i = 0; i <= 10; i++) {

			// Muestra un mensaje por pantalla.
			System.out.println(numero + " * " + i + " = " + resultado);

			// Sumamos el valor del resultado mas el numero introducido por el usuario.
			resultado += numero;

		}

		// Cerramos el escaner.
		scn.close();

	}

}
