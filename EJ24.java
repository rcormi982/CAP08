/**
* Nos dice si un determindado valor está o no dentro de un array de números
* enteros.
*
* @param x array unidimiensional de números enteros
* @param n números entero que se buscará dentro del array
* @return verdadero si <code>n</code> se encuentra en el array
* <code>x</code> en caso contrario.
*/
public class EJ24 {
    public static boolean estaEnArrayInt(int[] x, int n){
        for (int numero : x) {
            if(numero == n){
                return true;
            }
        }
        return false;
    } 
}
