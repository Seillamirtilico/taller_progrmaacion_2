import java.util.Scanner;

public class ContadorPositivosNegativos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        int positivos = 0;
        int negativos = 0;

        System.out.println("Ingresa varios números enteros (ingresa 0 para finalizar):");

        do {
            numero = entrada.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }

        } while (numero != 0);

        System.out.print("Cantidad de números positivos: ");
        for (int i = 0; i < positivos; i++) {
            System.out.print("*");
        }

        System.out.println();

        System.out.print("Cantidad de números negativos: ");
        for (int i = 0; i < negativos; i++) {
            System.out.print("*");
        }
    }
}
