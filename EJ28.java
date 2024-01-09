public class EJ28 {
    public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
        int[] a = x.clone(); // clona en a el contenido de x
        int i;
        int aux;
        while (n-- > 0) {
            aux = a[0];
            for(i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1] = aux;
        }
        return a;
    }
}
