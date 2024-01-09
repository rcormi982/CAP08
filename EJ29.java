/**
* Crea un array bidimensional de números enteros y lo rellena con valores
* aleatorios dentro de un rango.
* <p>
* Por ejemplo, <code>generaArrayBiInt(8, 7, 10, 30)</code> devolvería un
* array de 8 filas por 7 columnas relleno con números generados al azar
* comprendidos entre 10 y 30.
*
* @param filas número de filas que tendrá el array
* @param columnas número de columnas que tendrá el array
* @param minimo límite inferior del intervalo de números aleatorios
* @param máximo límite superior del intervalo de números aleatorios
* @return array bidimensional de números enteros rellena con valores
* aleatorios dentro del rango definido por los valores
* <code>minimo</code> y <code>maximo</code>
*/
public class EJ29 {
    public static int[][] generaArrayBiInt(int filas, int columnas, int minimo, int maximo) {
        int[][] x = new int[filas][columnas];
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                x[i][j] = (int)(Math.random()*(maximo - minimo) + minimo + 1);
            }
        }
        return x;
    }
}
