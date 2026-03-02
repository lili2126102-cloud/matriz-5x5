import java.util.Scanner;
import java.util.ArrayList;

public class Matriz5x5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        
        // 1. Ingreso de datos
        System.out.println("INGRESO DE DATOS Matriz 5x5");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = leer.nextInt();
            }
        }

        // 2. Mostrar matriz en forma de tabla
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // 3.Aplanado usando ArrayList
        System.out.println("--------------------");
        ArrayList<Integer> listaAplanada = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                listaAplanada.add(matriz[i][j]);
            }
        }
        System.out.println("Matriz aplanada (lista): " + listaAplanada);
    }
}
