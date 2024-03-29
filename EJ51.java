import Matematicas.Varias;

public class EJ51 {
    public static void main(String[] args) {
        int[] a = EJ20.generaArrayInt(10, 2, 100);
        System.out.println("Array generado:");
        System.out.println();
        for (int n : a) {
            if (Matematicas.Varias.esPrimo(n)) {
                System.out.print("El " + n + " es primo");
            } else {
                System.out.print("El " + n + " no es primo");
            }
            if (Matematicas.Varias.esCapicua(n)) {
                System.out.println(" y es capicúa.");
            } else {
                System.out.println(" y no es capicúa.");
            }
        }
    }
}
