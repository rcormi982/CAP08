/**
* Devuelve la media aritmética de los números contenidos en el array que se
* pasa como parámetro.
*
* @param x array unidimiensional de números enteros
* @return media aritmética de los números contenidos en el array que se pasa
* como parámetro
*/
public class EJ23 {
  public static double mediaArrayInt(int[] x){
    int suma = 0;
    for (int n : x) {
        suma += n;
    }
    return (double)suma/x.length;
  }  
}
