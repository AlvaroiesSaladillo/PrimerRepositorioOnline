package ejercicio2;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {

		Random random = new Random();

		int numeroAleatorio = 0;

		// Hacemos un recorrido desde cero hasta veinte
		for (int i = 0; i <= 20; i++) {

			// Muestra un mensaje por pantalla
			System.out.println("Lanzamiento numero " + i + ":");

			// Elegimos aleatoriameente un numero entre 1 y 6.
			numeroAleatorio = random.nextInt(6) + 1;

			// Muestra un mensaje por pantalla al usuario.
			System.out.println("Numero del dado: " + numeroAleatorio);

		}

	}

}
