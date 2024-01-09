/**
* Devuelve una fila (array unidimensional) de un array bidimensional
* que se pasa como parámetro.
*
* @param x array bidimiensional de números enteros
* @param fila número de la fila que se quiere extraer del array
* <code>x</code>
* @return fila en forma de array unidimensional extraida del
* array <code>x</code>
*/
public class EJ30 {
    public static int[] filaDeArrayBiInt(int x[][], int fila) {
        int[] f = new int[x[0].length];
        for (int c = 0; c < x[0].length; c++) {
            f[c] = x[fila][c];
        }
        return f;
    }
}
