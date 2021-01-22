package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int n = 0;
		
		int contador = 0;
		
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
		
		//Hacemos un recorrido desde cero hasta el numero introducido por el usuario.
		for (int i = 0; i < n; i++) {
			
			for (int j = i; j < n; j++) {
				
				// Muestra por pantalla un espacio en blanco.
				System.out.print(" ");
				
			}
			
			//Hacemos un recorrido desde cero hasta el valor de la repeticion del recorrido.
			for (int j = 0; j < i+1; j++) {
				
				//Sumamos la variable contador mas uno.
				contador++;
				
				// Muestra por el valor de la variable "contador" y un espacio en blanco.
				System.out.print(contador+" ");
				
			}
			
			//Reiniciamos la variable "contador" a cero.
			contador = 0;
			
			//Hacemos un salro de linea
			System.out.println();
			
		}
		
		//Cerramos el escaner.
		scn.close();

	}

}
