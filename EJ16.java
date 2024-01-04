/**
 * Muestra los números capicúas entre 1 y 99999
 */
import Matematicas.Varias;
public class EJ16 {
    public static void main(String[] args) {
        for (int i = 1; i < 100000; i++) {
            if(Matematicas.Varias.esCapicua(i)){
                System.out.print(i+ " ");
            }  
        }
    }
}
