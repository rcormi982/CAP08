/**
 * Escribe un programa que pase de binario a decimal
 */
import Matematicas.Varias;
public class EJ17 {
    public static void main(String[] args) {
        long decimal = 0;
        System.out.print("Introduce un número binario: ");
        long binario = Long.parseLong(System.console().readLine());

        int bits = Matematicas.Varias.digitos(binario);
        for (int i = 0; i < bits; i++) {
            decimal += Matematicas.Varias.digitoN(binario, bits - i - 1)*Matematicas.Varias.potencia(2, i); 
        }
        System.out.print(binario+ " en binario es " + decimal + " en decimal.");
    }
}
