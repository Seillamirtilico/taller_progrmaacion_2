import java.util.Scanner;

public class DuracionRecorrido {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int horas = 0;
        int minutos = 0;
        int duracionTramo = 0;
        int sumaDuracion = 0;
        int numeroTramos = 1;

        System.out.println("Ingresa la duración de cada tramo en minutos. Ingresa 0 para finalizar.");

        while (true) {
            System.out.println("Ingresa la duración en minutos del tramo número " + numeroTramos);
            duracionTramo = entrada.nextInt();
            sumaDuracion += duracionTramo;

            if (duracionTramo == 0) {
                horas = sumaDuracion / 60;
                minutos = sumaDuracion % 60;

                String horaFormato = (horas < 10) ? "0" + horas : String.valueOf(horas);
                String minutosFormato = (minutos < 10) ? "0" + minutos : String.valueOf(minutos);

                System.out.println("La duración total del recorrido es de " + horaFormato + ":" + minutosFormato);
                break;
            }

            numeroTramos++;
        }
    }
}
