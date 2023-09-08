import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random generadorAleatorio = new Random();
        int numeroSecreto = generadorAleatorio.nextInt(101);
        int intentosRestantes = 5;
        System.out.println("Bienvenido al juego de adivinar el número secreto.");
        System.out.println("Tienes " + intentosRestantes + " intentos.");

        int numeroIngresado = 0;

        do {
            System.out.print("Ingresa un número: ");
            numeroIngresado = entrada.nextInt();

            if (numeroIngresado == numeroSecreto) {
                System.out.println("¡Felicidades, has acertado!");
                break;
            } else if (numeroIngresado < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }

            intentosRestantes--;

            if (intentosRestantes > 0) {
                System.out.println("Tienes " + intentosRestantes + " intentos restantes.");
            } else {
                System.out.println("Has agotado tus intentos. El número secreto era " + numeroSecreto + ".");
            }

        } while (intentosRestantes > 0);
    }
}
