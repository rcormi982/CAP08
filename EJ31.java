/**
* Devuelve una columna (array unidimensional) de un array
* bidimensional que se pasa como parámetro.
*
* @param x array bidimiensional de números enteros
* @param columna número de la columna que se quiere extraer del array
* <code>x</code>
* @return columna en forma de array unidimensional extraida
* del array <code>x</code>
*/
public class EJ31 {
    public static int[] columnaDeArrayBiInt(int x[][], int columna) {
        int[] c = new int[x.length];
        for (int f = 0; f < x.length; f++) {
            c[f] = x[f][columna];
        }
        return c;
    }
}
