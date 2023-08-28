package arreglos;

import java.util.Scanner;
/**
 *
 * @author SENA
 */
public class MatrizAgregadaporUsuario {
    public static void main(String[] args) {
        int pares=0;
        Scanner teclado = new Scanner(System.in);
        int matriz[][]=new int[3][3];
        for (int fila = 0; fila < 3; fila++) {
            for (int columnas = 0; columnas < 3; columnas++) {
                System.out.println("ingrese un numero entero");
                matriz[fila][columnas]=teclado.nextInt();
            }
            
        }
        System.out.println("Numeros Ingresados por el usuario");
        for (int fila = 0; fila < 3; fila++) {
            for (int columnas = 0; columnas < 3; columnas++) {
                System.out.print(matriz[fila][columnas]+"\t");
                if(matriz[fila][columnas] % 2==0){
                pares++;
                }
            }
            System.out.println("");
        }
            System.out.println("los numeros pares son: "+pares);
    }
}
