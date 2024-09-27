public class App {
    public static void main(String[] args) {
        System.out.println("Métodos de ordenamiento Selección");
        MetodosOrdenamiento mO = new MetodosOrdenamiento();
        int[] arreglo = {5, 10, 15, 12};

        int[] arregloOrdenado = mO.sortBySeleccion(arreglo, true);
        System.out.print("-");
        mO.printArregloOrdenado(arregloOrdenado);
        System.out.println();
        mO.sortBySeleccion(arreglo, false);
        System.out.print("-");
        mO.printArregloOrdenado(arreglo);
    }
}
