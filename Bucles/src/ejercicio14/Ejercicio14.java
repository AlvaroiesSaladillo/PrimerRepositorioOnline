package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static final String WHITE_BACKGROUND = "\u001B[47m";

	public static final String BLACK_BACKGROUND = "\u001B[40m";

	public static final String YELLOW_BACKGROUND = "\u001B[43m";

	public static final String CYAN_BACKGROUND = "\u001B[46m";

	public static final String RED = "\u001B[31m";

	public static final String RESET = "\u001B[0m";

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int x = 8;

		int y = 8;

		int posAlfiInicialX = 0;

		int posAlfiInicialY = 0;

		boolean salir = false;

		// Mientras que no podamos salir del bucle.
		while (!salir) {

			// Muestra por pantalla un mensaje
			System.out.println("Introduzca un numero para una celda del ajedrez para el alfil en posicion horizontal");

			// Solicitamos al usuario que introduzca un numero.
			posAlfiInicialX = scn.nextInt();

			// Muestra por pantalla un mensaje
			System.out.println("Introduzca un numero para una celda del ajedrez para el alfil en posicion vertical");

			// Solicitamos al usuario que introduzca un numero.
			posAlfiInicialY = scn.nextInt();

			// Si el valor de posAlfiInicialX es mayor e igual que el valor de "x" y el
			// valor de posAlfiInicialY es mayor que cero y el valor de posAlfiInicialY es
			// menor que y
			if (((posAlfiInicialX >= 0) && (posAlfiInicialX < x))
					&& ((posAlfiInicialY >= 0) && (posAlfiInicialY < y))) {

				// Salimos del bucle.
				salir = true;

				// Si el valor de posAlfiInicialX es menor que cero o mayor que el valor de "x"
				// y posAlfiInicialY es menor que cero o mayor que el valor de "y".
			} else {

				// Muestra por pantalla un mensaje
				System.out.println("Los numeros que introduciste estan fuera de rango, intenta de nuevo");

			}

		}

		int movimientoAlfilIzquierdaX = posAlfiInicialX;

		int movimientoAlfilIzquierdaY = posAlfiInicialY;

		int movimientoAlfilDerechaX = posAlfiInicialX;

		int movimientoAlfilDerechaY = posAlfiInicialY;

		// Buscamos la primera posicion dibujable desde la posicion inicial del marfil
		// introducido por el usuario hasta cero.
		while (movimientoAlfilIzquierdaX > 0 && movimientoAlfilIzquierdaY > 0) {

			// Restamos el valor de movimientoAlfilIzquierdaX a menos uno.
			movimientoAlfilIzquierdaX--;

			// Restamos el valor de movimientoAlfilIzquierdaY a menos uno.
			movimientoAlfilIzquierdaY--;

		}

		// Buscamos la primera posicion dibujable desde la posicion inicial del marfil
		// introducido por el usuario hasta cero.
		while (movimientoAlfilDerechaX < x - 1 && movimientoAlfilDerechaY > 0) {

			// Sumamos el valor de movimientoAlfilDerechaX a mas uno.
			movimientoAlfilDerechaX++;

			// Sumamos el valor de movimientoAlfilDerechaY a menos uno.
			movimientoAlfilDerechaY--;

		}

		// Hacemos un recorrido desde cero hasta el valor de x
		for (int i = 0; i < x; i++) {

			// Hacemos un segundo recorrido desde cero hasta el valor de y
			for (int j = 0; j < y; j++) {

				// Si el valor de iteracion de i es igual que el valor de posAlfiInicialY y el
				// valor de j es igual que posAlfiInicialX
				if (i == posAlfiInicialY && j == posAlfiInicialX) {

					// Muestra por pantalla una celda de color cyan y un icono de Alfil.
					System.out.print(CYAN_BACKGROUND + "♝  " + RESET);

					// Sumamos mas uno el valor de movimientoAlfilIzquierdaX
					movimientoAlfilIzquierdaX++;

					// Sumamos mas uno el valor de movimientoAlfilIzquierdaY
					movimientoAlfilIzquierdaY++;

					// Restamos menos uno el valor de movimientoAlfilDerechaX
					movimientoAlfilDerechaX--;

					// Sumamos mas uno el valor de movimientoAlfilDerechaX
					movimientoAlfilDerechaY++;

					// Si el valor de repeticion de i es igual que el valor de
					// movimientoAlfilIzquierdaY y el valor de j es igual que
					// movimientoAlfilIzquierdaX
				} else if ((i == movimientoAlfilIzquierdaY) && (j == movimientoAlfilIzquierdaX)) {

					// Muestra por pantalla una celda de color amarillo.
					System.out.print(YELLOW_BACKGROUND + "  " + RESET);

					// Sumamos mas uno el valor de movimientoAlfilIzquierdaX
					movimientoAlfilIzquierdaX++;

					// Sumamos mas uno el valor de movimientoAlfilIzquierdaX
					movimientoAlfilIzquierdaY++;

					// Si el valor de repeticion de i es igual que el valor de
					// movimientoAlfilDerechaY y el valor de j es igual que movimientoAlfilDerechaX
				} else if (i == movimientoAlfilDerechaY && j == movimientoAlfilDerechaX) {

					// Muestra por pantalla una celda de color amarillo.
					System.out.print(YELLOW_BACKGROUND + "  " + RESET);

					// Restamos menos uno el valor de movimientoAlfilDerechaY
					movimientoAlfilDerechaX--;

					// Sumamos mas uno el valor de movimientoAlfilDerechaY
					movimientoAlfilDerechaY++;

					// Si ninguna de las condiciones anteriores se cumplen.
				} else {

					// Si el resto del valor de la repeticion del primer recorrido es igual a cero.
					if (i % 2 == 0) {

						// Si el resto del valor de la repeticion del segundo recorrido es igual a cero.
						if (j % 2 == 0) {

							System.out.print(WHITE_BACKGROUND + "  " + RESET);

							// Si el resto del valor de la repeticion del segundo recorrido no es igual a
							// cero.
						} else {

							System.out.print(BLACK_BACKGROUND + "  " + RESET);

						}

					} else {

						// Si el resto del valor de la repeticion del segundo recorrido es igual a cero.
						if (j % 2 == 0) {

							// Muestra por pantalla una celda de color negro.
							System.out.print(BLACK_BACKGROUND + "  " + RESET);

							// Si el resto del valor de la repeticion del segundo recorrido no es igual a
							// cero.
						} else {

							// Muestra por pantalla una celda de color blanco.
							System.out.print(WHITE_BACKGROUND + "  " + RESET);

						}

					}

				}

			}

			// Hacemos un salto de linea
			System.out.println();

		}

	}

}
