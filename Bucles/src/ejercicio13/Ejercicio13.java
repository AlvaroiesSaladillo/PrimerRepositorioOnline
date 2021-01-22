package ejercicio13;

public class Ejercicio13 {

	public static final String WHITE_BACKGROUND = "\u001B[47m";

	public static final String BLACK_BACKGROUND = "\u001B[40m";

	public static final String RESET = "\u001B[0m";

	public static void main(String[] args) {

		int x = 8;

		int y = 8;

		// Hacemos un recorrido desde cero hasta el valor de y
		for (int i = 0; i < y; i++) {

			// Hacemos un recorrido desde cero hasta el valor de x
			for (int j = 0; j < x; j++) {

				// Si el resto del valor de la repeticion del primer recorrido es igual a cero.
				if (i % 2 == 0) {

					// Si el resto del valor de la repeticion del segundo recorrido es igual a cero.
					if (j % 2 == 0) {

						// Muestra por pantalla una celda de color blanco.
						System.out.print(WHITE_BACKGROUND + "  " + RESET);

						// Si el resto del valor de la repeticion del segundo recorrido no es igual a cero.
					} else {

						// Muestra por pantalla una celda de color negro
						System.out.print(BLACK_BACKGROUND + "  " + RESET);

					}

					// Si el resto del valor de la repeticion del primer recorrido no es igual a cero.
				} else {

					// Si el resto del valor de la repeticion del segundo recorrido es igual a cero.
					if (j % 2 == 0) {

						// Muestra por pantalla una celda de color negro.
						System.out.print(BLACK_BACKGROUND + "  " + RESET);

						// Si el resto del valor de la repeticion del segundo recorrido no es igual a cero.
					} else {

						// Muestra por pantalla una celda de color blanco.
						System.out.print(WHITE_BACKGROUND + "  " + RESET);

					}

				}

			}

			// Hacemos un salto de linea
			System.out.println();

		}

	}

}
