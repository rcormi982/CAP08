/**
* Devuelve un array que contiene una de las diagonales del array
* bidimensional que se pasa como parámetro.
*
* @param x array bidimiensional de números enteros
* @param fila fila del número que marcará las dos posibles
* diagonales dentro del array <code>x</code>
* @param columna columna del número que marcará las dos posibles
* diagonales dentro del array <code>x</code>
* @param direccion cadena de caracteres que indica cuál de las dos
* posibles diagonales se devolverá; la cadena <code>
* "nose"</code> indica que se elige la diagonal que
* va del noroeste hacia el sureste, mientras que la
* cadena <code>"neso"</code> indica que se elige la
* diagonal que va del noreste hacia el suroeste
* @return array unidimensional que contiene una diagonal
* definida por un número determinado por <code>fila
* </code> y <code>columna</code> y una dirección
* determinada por el parámetro <code>direccion
* </code>
*/
public class EJ34 {
    public static int[] diagonal(int[][] x, int fila, int columna, String direccion) {
        int elementos = 0, i, j;
        int[] diagonalAux = new int [1000];
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[0].length; j++) {
                if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))|| (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
                    diagonalAux[elementos++] = x[i][j];
                }
            }
        }
        int[] diagonal = new int[elementos];
        for (j = 0; j < elementos; j++) {
            diagonal[j] = diagonalAux[j];
        }
        return diagonal;
    }     
}
