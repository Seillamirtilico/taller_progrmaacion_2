import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la fila de partida (1-8): ");
        int filaPartida = entrada.nextInt();

        System.out.println("Introduce la columna de partida (1-8): ");
        int columnaPartida = entrada.nextInt();

        int[][] movimientosCaballo = {
                {-2, -1}, {-2, 1},
                {-1, -2}, {-1, 2},
                {1, -2}, {1, 2},
                {2, -1}, {2, 1}
        };

        if (filaPartida >= 1 && filaPartida <= 8 && columnaPartida >= 1 && columnaPartida <= 8) {
            System.out.println("Posiciones a las que puede moverse el caballo:");

            for (int i = 0; i < movimientosCaballo.length; i++) {
                int nuevaFila = filaPartida + movimientosCaballo[i][0];
                int nuevaColumna = columnaPartida + movimientosCaballo[i][1];

                if (nuevaFila >= 1 && nuevaFila <= 8 && nuevaColumna >= 1 && nuevaColumna <= 8) {
                    System.out.println("(" + nuevaFila + ", " + nuevaColumna + ")");
                }
            }
        } else {
            System.out.println("La posición ingresada no es válida.");
        }
    }
}
