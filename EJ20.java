/**
 * Crea un array y lo rellena con valores aleatorios dentro de un rango.
 * Por ejemplo, <code>generaArrayInt(100, 10, 30)</code> devolvería un array
 * de 100 números generados al azar comprendidos entre 10 y 30.
 *
 * @param n número de elementos que contendrá el array
 * @param minimo límite inferior del intervalo de números aleatorios
 * @param maximo límite superior del intervalo de números aleatorios
 * @return array relleno con valores aleatorios dentro del rango
 * definido por <code>minimo</code> y <code>maximo</code>
 */
public class EJ20 {
    public static int[] generaArrayInt(int n, int minimo, int maximo){
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=(int)(Math.random()*(maximo-minimo+1)+minimo);
        }
        return x;
    }
}
