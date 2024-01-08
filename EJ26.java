/**
* Le da la vuelta a un array. Los primeros números estarán al final y
* viceversa.
*
* @param x array unidimiensional de números enteros
* @return array volteada con los primeros números al final y viceversa
*/
public class EJ26 {
    public static int[] volteaArrayInt(int[] x){
        int[] a = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            a[x.length-i-1] = x[i];
        }
        return a;
    }
}