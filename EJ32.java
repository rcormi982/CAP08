/**
* Devuelve la fila y la columna (en un array con dos elementos) de la
* primera ocurrencia de un número dentro de un array bidimensional.
* Si el número no se encuentra en el array, la función devuelve -1.
*
* @param x array bidimiensional de números enteros
* @param n número que se buscará dentro del array <code>x</code>
* @return array unidimensional de dos elementos que indican la fila
* y la columna donde se encuentra <code>n</code> o <code>
* {-1, -1}</code> en caso de que <code>n</code> no se
* encuentre en <code>x</code>
*/
public class EJ32 {
    public static int[] coordenadasEnArrayBiInt(int x[][], int n) {
        for (int f = 0; f < x.length; f++) {
            for (int c = 0; c < x[0].length; c++) {
                if (x[f][c] == n) {
                    int[] coordenadas = {f, c};
                    return coordenadas;
                }
            }
        }
        int[] coordenadas = {-1, -1};
        return coordenadas;
    }
}
