/*
O QuickSort é um dos algoritmos de ordenação mais eficientes, com complexidade média de 
O(n log n)
⁡
Ele é baseado na técnica de "dividir para conquistar". A ideia básica do QuickSort é selecionar um elemento como pivô, 
dividir o array em duas subpartes, e então ordenar as subpartes recursivamente.

Passos do Algoritmo QuickSort
Escolha do Pivô: Pode ser o primeiro, último, meio ou qualquer elemento aleatório do array.
Particionamento: Reorganiza o array de modo que todos os elementos menores que o pivô fiquem à esquerda e todos os elementos 
maiores que o pivô fiquem à direita.
Recursão: Aplica o QuickSort recursivamente às subpartes à esquerda e à direita do pivô.

Implementação do QuickSort em Java
 */

 public class QuickSort 
 {

    public static void main(String[] args) 
    {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, n - 1);

        System.out.println("Array ordenado:");
        printArray(arr);
    }

    /* Método que implementa o QuickSort */
    void sort(int[] arr, int low, int high) 
    {
        if (low < high) 
        {
            /* pi é o índice de partição, arr[pi] está no lugar certo */
            int pi = partition(arr, low, high);

            // Ordena recursivamente os elementos antes e depois da partição
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /* Este método toma o último elemento como pivô, coloca o pivô na sua posição correta no array ordenado, e coloca todos os menores à esquerda do pivô e todos os maiores à direita */
    int partition(int[] arr, int low, int high) 
    {
        int pivot = arr[high];
        int i = (low - 1); // Índice do menor elemento

        for (int j = low; j < high; j++) 
        {
            // Se o elemento atual é menor ou igual ao pivô
            if (arr[j] <= pivot) 
            {
                i++;

                // Troca arr[i] e arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Troca arr[i+1] e arr[high] (ou o pivô)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /* Função utilitária para imprimir o array */
    static void printArray(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
