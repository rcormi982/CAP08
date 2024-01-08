/**
* Devuelve un array rotada <code>n</code> posiciones a la derecha tomando
* como referencia el array que se pasa como parámetro. Los números que van
* saliendo por la derecha vuelven a entrar por la izquierda.
*
* @param x array unidimiensional de números enteros
* @param n número de movimientos (rotaciones hacia la derecha) a realizar
* @return array rotada <code>n</code> posiciones a la derecha
*/
public class EJ27 {
    public static int[] rotaDerechaArrayInt(int[] x, int n){
        int[] a = x.clone(); // clona en a el contenido de x
        int i;
        int aux;
        while (n-- > 0) {
            aux = a[a.length - 1];
            for(i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = aux;
        }
        return a;
    }
}
