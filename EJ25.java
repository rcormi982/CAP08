/**
* Devuelve la posición (el índice) de la primera ocurrencia de un número
* dentro de un array.
*
* @param x array unidimiensional de números enteros
* @param n números entero que se buscará dentro del array
* @return posición (índice) de la primera ocurrencia del número
* <code>n</code> dentro del array <code>x</code> o -1 en caso de
* no encontrarse el número
*/
public class EJ25 {
    public static int posicionEnArrayInt(int[] x, int n){
        for (int i = 0; i < x.length; i++) {
            if(x[i] == n){
                return i;
            }
        }
        return -1;
    }
}
