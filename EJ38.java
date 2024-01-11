import static Matematicas.Varias.esCapicua;
public class EJ38 {
    public static int[] filtraCapicuas(int x[]) {
        int[] capicuas = new int[x.length];
        int cuentaCapicuas = 0;
        for (int numero : x) {
            if (esCapicua(numero)) {
                capicuas[cuentaCapicuas++] = numero;
            }
        }
        int[] resultado = new int[cuentaCapicuas];
        for (int i = 0; i < cuentaCapicuas; i++) {
            resultado[i] = capicuas[i];
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] numeros = EJ20.generaArrayInt(20, 1, 1000);
        System.out.println("Array original: ");
        EJ20BIS.muestraArrayInt(numeros);
        System.out.println("\nCapicúas: ");
        EJ20BIS.muestraArrayInt(filtraCapicuas(numeros));
    }   
}
