public class App {
    public static void main(String[] args) {
        System.out.println("Métodos de ordenamiento Selección");
        MetodosOrdenamiento mO = new MetodosOrdenamiento();

        int[] arreglo = {5, 10, 15, 12};

        mO.sortBySeleccion(arreglo, true);
        mO.printArregloOrdenado(arreglo);

        System.out.println();

        mO.sortBySeleccion(arreglo, false);
        mO.printArregloOrdenado(arreglo);
    }
}
