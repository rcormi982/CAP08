/**
* Dice si un número que se encuentra en una posición determinada de
* una matriz (un array bidimensional) que se pasa como parámetro es o
* no punto de silla.
* El punto de silla cumple la condición de ser el mínimo en su fila y
* máximo en su columna.
*
* @param x array bidimiensional de números enteros
* @param i fila dentro del array <code>x</code>
* @param j columna dentro del array <code>x</code>
* @return verdadero si el número que se encuentra en la fila <code>i
* </code> y la columna <code>j</code> es el mínimo en su
* fila y el máximo en su columna.
*/
public class EJ33 {
    public static boolean esPuntoDeSilla(int x[][], int i, int j) {
        int[] fila = EJ30.filaDeArrayBiInt(x, i);
        int[] columna = EJ31.columnaDeArrayBiInt(x, j);
        return ((EJ21.minimoArrayInt(fila) == x[i][j])&& (EJ22.maximoArrayInt(columna) == x[i][j]));
    }
}
