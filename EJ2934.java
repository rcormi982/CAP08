public class EJ2934 {
    public static void main(String[] args) {
        int[][] a = EJ29.generaArrayBiInt(5, 8, 0, 100);
        EJ29BIS.muestraArrayBiInt(a);
        System.out.print("\nFila 2: ");
        EJ20BIS.muestraArrayInt(EJ30.filaDeArrayBiInt(a, 2));
        System.out.print("\nColumna 6: ");
        EJ20BIS.muestraArrayInt(EJ31.columnaDeArrayBiInt(a, 6));
        System.out.print("\nCoordenadas del 24 (fila, columna): ");
        EJ20BIS.muestraArrayInt(EJ32.coordenadasEnArrayBiInt(a, 24));
        int[][] b = {{11, 10, 9}, {4, 5, 7}, {2, 6, 1}};
        EJ29BIS.muestraArrayBiInt(b);
        System.out.println("\nBusca los puntos de silla: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (EJ33.esPuntoDeSilla(b, i, j)) {
                    System.out.println("fila " + i + ", columna " + j + " -> " + b[i][j]);
                }
            }
        }
        EJ29BIS.muestraArrayBiInt(a);
        System.out.print("\nFila: ");
        int fila = Integer.parseInt(System.console().readLine());
        System.out.print("Columna: ");
        int columna = Integer.parseInt(System.console().readLine());
        System.out.print("Dirección (nose/neso): ");
        String direccion = System.console().readLine();
        System.out.print("\nDiagonal: ");
        EJ20BIS.muestraArrayInt(EJ34.diagonal(a, fila, columna, direccion));
    }
}
