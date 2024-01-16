
public class EJ2028 {
    public static void main(String[] args) {

        int[] a = EJ20.generaArrayInt(20, 0, 100);
        EJ20BIS.muestraArrayInt(a);
        System.out.println();
        System.out.println("Mínimo: " + EJ21.minimoArrayInt(a));
        System.out.println("Máximo: " + EJ22.maximoArrayInt(a));
        System.out.println("Media: " + EJ23.mediaArrayInt(a));
        if (EJ24.estaEnArrayInt(a, 24)) {
            System.out.println("El 24 está en el array.");
        } else {
            System.out.println("El 24 no está en el array.");
        }
        
        System.out.println("El 24 está en la posición " + EJ25.posicionEnArrayInt(a, 24));
        System.out.print("Array al revés: ");
        EJ20BIS.muestraArrayInt(EJ26.volteaArrayInt(a));
        System.out.print("Array rotado 3 pasos a la derecha: ");
        EJ20BIS.muestraArrayInt(EJ27.rotaDerechaArrayInt(a, 3));
    }
}
