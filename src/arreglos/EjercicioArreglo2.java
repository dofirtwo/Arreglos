package arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class EjercicioArreglo2 {
    public static void main(String[] args) {
        //que el teclado lea nmeros entero y si es par lo guarde
        Scanner Teclado= new Scanner(System.in);
        int indice;
        indice=1;
        int numeros[]=new int[5];
        indice=0;
        do{
            System.out.print("Ingrese un numero entero: ");
            int num = Teclado.nextInt();
            if(num % 2==0){
                numeros[indice]=num;
                indice++;
            }
        }while(indice<5);
        System.out.println("ARREGLO CON #S PARES");
        System.out.println(Arrays.toString(numeros));
    }
}
   
 