package arreglos;
/**
 *
 * @author SENA
 */
public class ArregloUnosYCeros {
    public static void main(String[] args) {
        int[][] Unos = new int [3][3];
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(Unos[fila][columna]);
            }
            System.out.println("");
        }
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if(fila==columna){
                    Unos[fila][columna]=1;
                }
         }
    
}
        System.out.println("Matriz Identica");
         for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(Unos[fila][columna]);
            }
            System.out.println("");
        }
    }
}