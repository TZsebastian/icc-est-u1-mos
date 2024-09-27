public class MetodosOrdenamiento {

    public int[] sortBySeleccion(int[] arreglo) {
        int tamanio = arreglo.length;

        for (int i = 0; i < tamanio - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[j] < arreglo[indice]) { 
                    indice = j;
                }
            }
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }

    public void printArregloOrdenado(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public int[] sortBySeleccion(int[] arreglo, boolean ascendente) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int indice = i;
            for (int j = i + 1; j < n; j++) {
                if (ascendente) {
                    if (arreglo[j] < arreglo[indice]) {
                        indice = j;
                    }
                } else {
                    if (arreglo[j] > arreglo[indice]) {
                        indice = j;
                    }
                }
            }
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }
}
