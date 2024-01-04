/**
 * Muestra los números primos que hay entre 1 y 1000
 */
import Matematicas.Varias;

public class EJ15 {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            if(Matematicas.Varias.esPrimo(i)){
                System.out.print(i + " ");
            }
        }
    }
}
