public class EJ52 {
    public static int aleatorioDeArray(int[] a) {
        return a[(int)(Math.random() * a.length)];
    }
    public static void main(String[] args) {
        int[] a = {111, 222, 333, 444};
        int[] b = {52, 37};
        System.out.println(aleatorioDeArray(a));
        System.out.println(aleatorioDeArray(b));
    }   
}
