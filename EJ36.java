import static Matematicas.Varias.esPrimo;
public class EJ36 {
    public static int[] filtraPrimos(int x[]) {
        int[] primos = new int[x.length];
        int cuentaPrimos = 0;
        for (int numero : x) {
            if (esPrimo(numero)) {
                primos[cuentaPrimos++] = numero;
            }
        }
        int[] resultado = new int[cuentaPrimos];
        for (int i = 0; i < cuentaPrimos; i++) {
            resultado[i] = primos[i];
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] numeros = EJ20.generaArrayInt(20, 1, 100);
        System.out.println("Array original: ");
        EJ20BIS.muestraArrayInt(numeros);
        System.out.println("\nPrimos: ");
        EJ20BIS.muestraArrayInt(filtraPrimos(numeros));
    }    
}
