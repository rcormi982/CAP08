/**
* Devuelve el máximo (el número más grande) del array que se pasa como
* parámetro.
*
* @param x array unidimiensional de números enteros
* @return el número más grande encontrado en el array que se pasa como
* parametro
*/
public class EJ22 {
    public static int maximoArrayInt(int[] x) {
        int maximo = Integer.MIN_VALUE;
        for (int n : x) {
            if (n > maximo) {
                maximo = n;
            }
        }
        return maximo;
    }
}
