package Matematicas;

public class Varias {

public static boolean esCapicua(long x) {
    return x == voltea(x);
}
/**
 * Devuelve verdadero si el número que se pasa como parámetro es capicúa
 * y falso en caso contrario.
 * @param n número que se quiere saber si es capicúa.
 * @return verdadero si el número que se pasa como parámetro es capicúa
 *         y falso en caso contrario.
 */
public static boolean esCapicua(int n){
    return esCapicua((long)n);
}
public static boolean esPrimo(long n){
    if(n < 2){
        return false;
    }else{
        for (long i = 2; i < n/2; i++) {
            if(n % i == 0){
                return false;
            } 
        }
    }
    return true;
}  
public static boolean esPrimo(int n) {
    return esPrimo((long) n);
}
/**
 * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 * @param n un número entero.
 * @return el menor primo que es mayor al número que se pasa como parámetro.
 */ 
public static int siguientePrimo(int n){
    while (!esPrimo(++n)) {} 
    return n;
}
public static double potencia(int base, int exponente){
    if(exponente == 0){
        return 1;
    }
    if(exponente < 0){
        return 1/potencia(base, -exponente);
    }
    int n = 1;
    for (int i = 0; i < Math.abs(exponente); i++) {
        n = n * base;
    }
    return n;
}
/**
 * Cuenta el número de dígitos de un número entero.
 * @param n númemro al que se le quieren contar los dígitos.
 * @return número de dígitos que tiene el número que se pasa como parámetro.
 */
public static int digitos(long n){
    if(n < 0){
        n = -n;
    }
    if(n == 0){
        return 1;
    }else{
        int cont = 0;
        while (n > 0) {
            n = n/10;//Se le quita un dígito a n.
            cont++;//incrementa la cuenta de dígitos.  
        }
        return cont;
    }
}
public static int digitos(int n){
    return digitos((long)n);
}
public static long voltea(long n){
    if(n < 0){
        return -voltea(-n);
    }
    long volteado = 0;
    while (n>0) {
        volteado = volteado * 10 + (n % 10);
        n /=10;
    }
    return volteado;
}
public static int voltea(int n){
    return (int)voltea((long)n);
}
/**
 * Devuelve el dígito que está en la posición n de un número entero.
 * Se empieza contando por el 0 y de izquierda a derecha.
 * @param x número entero.
 * @param n posición dentro del número x.
 * @return dígito que está en la posición n del número x 
 *         empezando a contar por el 0 y de izquierda a derecha.
 */
public static int digitoN(long x, int n){
    x = voltea(x);
    while (n-->0) {
        x /= 10;
    }
    return (int) x % 10;
}
public static int digitoN(int x, int n){
    return digitoN((long)x, n);
}
/**
 * Da la posición de la primera ocurrencia de un digito dentro de un número
 * entero. Si no se encuentra devuelve -1.
 * @param x número entero.
 * @param d dígito a buscar dentro del número.
 * @return posición de la primera ocurrencia del dígito dentro del número 0
 *         -1 si no se encuentra.
 */
public static int posicionDeDigito(long x, int d) {
    int i;
    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};
    if (i == digitos(x)) {
        return -1;
    } else {
        return i;
    }
}
public static int posicionDeDigito(int x, int d) {
    return posicionDeDigito((long)x, d);
}
/**
 * Le quita a un número n dígitos por detrás (por la derecha).
 * @param x número entero.
 * @param n número de dígitos que se van a quitar.
 * @return número inicial x con n dígitos menos quitados por la derecha.
 */
public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
}
public static int quitaPorDetras(int x, int n) {
    return (int)quitaPorDetras((long) x, n);
}
public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
}
public static int quitaPorDelante(int x, int n) {
    return (int)quitaPorDelante((long)x, n);
}
public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
}
public static int pegaPorDetras(int x, int d) {
    return (int)pegaPorDetras((long)x, d);
}
public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
}
public static int pegaPorDelante(int x, int d) {
    return (int)pegaPorDelante((long)x, d);
}
public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
}
public static int trozoDeNumero(int x, int inicio, int fin) {
    return (int)trozoDeNumero((long)x, inicio, fin);
}
public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos(y))) + y;
}
public static int juntaNumeros(int x, int y) {
    return (int)(juntaNumeros((long)x, (long)y));
}
}


