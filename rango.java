import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Introduce la cantidad de datos que deseas analizar: ");
            int cantidadDatos = entrada.nextInt();

            if (cantidadDatos <= 0) {
                System.out.println("La cantidad de datos debe ser un número positivo.");
                return;
            }

            double[] datos = new double[cantidadDatos];
            double valorMaximo = Double.MIN_VALUE;
            double valorMinimo = Double.MAX_VALUE;

            for (int i = 0; i < cantidadDatos; i++) {
                System.out.print("Ingresa el valor número " + (i + 1) + ": ");
                double valor = entrada.nextDouble();
                datos[i] = valor;

                if (valor > valorMaximo) {
                    valorMaximo = valor;
                }

                if (valor < valorMinimo) {
                    valorMinimo = valor;
                }
            }

            double rango = valorMaximo - valorMinimo;
            System.out.println("El rango de los datos es: " + rango);
        }
    }
