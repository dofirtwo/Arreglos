package arreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class EjercicioArreglo {
    public static void main(String[] args) {
        //pedir por teclado que el usuario ingrese ciudades
        Scanner teclado=new Scanner(System.in);
        String[]ciudades=new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("ingrese una ciudad de colombia: ");
            ciudades[i]=teclado.nextLine();
        }
        System.out.println(Arrays.toString(ciudades));
        }
        
    }
