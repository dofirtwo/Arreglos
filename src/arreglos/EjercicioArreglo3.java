package arreglos;

import java.util.Arrays;

/**
 *
 * @author SENA
 */
public class EjercicioArreglo3 {
    public static void main(String[] args) {
        //arreglo de 5 con numeros randoms que genere el sistema de 1 a 100
        int numero[]=new int[5];
        for (int i = 0; i < 5; i++) {
        int num = (int)(Math.random() * 100 );
          numero[i]=num;  
        }
        System.out.println(Arrays.toString(numero));
    }
    
}
