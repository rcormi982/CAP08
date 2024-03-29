import static Matematicas.Varias.digitos;
import static Matematicas.Varias.digitoN;

public class EJ37 {
    public static String convierteEnMorse(int n) {
        String[] morse = {"_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _",
        ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ ."
        };
        String resultado = "";
        for(int i = 0; i < digitos(n); i++) {
            resultado += morse[digitoN(n, i)];
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] numeros = {213, 0, 11, 24, 86};
        for (int numero : numeros) {
            System.out.print("El " + numero + " es el " + convierteEnMorse(numero));
            System.out.println(" en morse.");
        }
    }     
}
