public class EJ47 {
    public static String convierteArrayEnString(int[] a) {
        String resultado = "";
        for (int digito : a) {
            resultado += digito;
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] a = {};
        System.out.println("a: " + convierteArrayEnString(a));
        int[] b = {8};
        System.out.println("b: " + convierteArrayEnString(b));
        int[] c = {6, 2, 5, 0, 1};
        System.out.println("b: " + convierteArrayEnString(c));
    }     
}
