/**
* Devuelve el mínimo (el número más pequeño) del array que se pasa como
* parámetro.
*
* @param x array unidimiensional de números enteros
* @return el número más pequeño encontrado en el array que se pasa como
* parametro
*/
public class EJ21 {
    public static int minimoArrayInt(int[] x) {
        int minimo = Integer.MAX_VALUE;
        for (int n : x) {
            if (n < minimo) {
                minimo = n;
            }
        }
        return minimo;
    }
}
