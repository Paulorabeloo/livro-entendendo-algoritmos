import java.util.Arrays;

public class PesquisaBinaria 
{

    public static void main(String[] args) 
    {
        int[] arrayOrdenado = {2, 3, 4, 10, 40};
        int alvo = 10;
        PesquisaBinaria pb = new PesquisaBinaria();
        int resultado = pb.pesquisaBinaria(arrayOrdenado, alvo);

        System.out.println("Array: " + Arrays.toString(arrayOrdenado));
        System.out.println("Elemento procurado: " + alvo);

        if (resultado == -1) 
        {
            System.out.println("Elemento não está presente");
        } 
        else 
        {
            System.out.println("Elemento está no índice: " + resultado);
        }
    }

    public int pesquisaBinaria(int[] arr, int alvo) 
    {
        int baixo = 0;
        int alto = arr.length - 1;

        while (baixo <= alto) 
        {
            int meio = baixo + (alto - baixo) / 2; // Evita estouro de inteiros

            // Verifica se o alvo está presente no meio
            if (arr[meio] == alvo) 
            {
                return meio;
            }

            // Se o alvo for maior, ignora a metade esquerda
            if (arr[meio] < alvo) 
            {
                baixo = meio + 1;
            }
            // Se o alvo for menor, ignora a metade direita
            else 
            {
                alto = meio - 1;
            }
        }

        // Se o elemento não estiver presente no array
        return -1;
    }
}



/*  -- NOTAÇÃO BIG O -- 

O(1): Constante. O tempo de execução não depende do tamanho da entrada.

// Exemplo: Acessar um elemento específico em um array
public int getElement(int[] arr, int index) 
{
    return arr[index];
}


O(log n): Logarítmica. O tempo de execução cresce logaritmicamente com o tamanho da entrada. -> Exemplo PesquisaBinaria em ingles ->

// Exemplo: Pesquisa binária
public int binarySearch(int[] arr, int target) 
{
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) 
    {
        int mid = low + (high - low) / 2;

        if (arr[mid] == target) 
        {
            return mid;
        } 
        else if (arr[mid] < target) 
        {
            low = mid + 1;
        } 
        else 
        {
            high = mid - 1;
        }
    }
    return -1;
}


O(n): Linear. O tempo de execução cresce linearmente com o tamanho da entrada.

// Exemplo: Encontrar o maior elemento em um array
public int findMax(int[] arr) 
{
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) 
    {
        if (arr[i] > max) 
        {
            max = arr[i];
        }
    }
    return max;
}


O(n log n): Linearítmica. O tempo de execução cresce lineariticamente com o tamanho da entrada. -> QUICKSHORT 

// Exemplo: Ordenação por mistura (merge sort)
public void mergeSort(int[] arr, int left, int right) 
{
    if (left < right) 
    {
        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }
}

private void merge(int[] arr, int left, int mid, int right) 
{
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++) 
    {
        L[i] = arr[left + i];
    }
    for (int j = 0; j < n2; j++) 
    {
        R[j] = arr[mid + 1 + j];
    }

    int i = 0, j = 0;
    int k = left;
    while (i < n1 && j < n2)
    {
        if (L[i] <= R[j]) 
        {
            arr[k] = L[i];
            i++;
        } 
        else 
        {
            arr[k] = R[j];
            j++;
        }
        k++;
    }

    while (i < n1) 
    {
        arr[k] = L[i];
        i++;
        k++;
    }

    while (j < n2) 
    {
        arr[k] = R[j];
        j++;
        k++;
    }
}


O(n^2): Quadrática. O tempo de execução cresce quadraticamente com o tamanho da entrada.

// Exemplo: Ordenação por seleção (selection sort)
public void selectionSort(int[] arr) 
{
    for (int i = 0; i < arr.length - 1; i++) 
    {
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) 
        {
            if (arr[j] < arr[minIndex]) 
            {
                minIndex = j;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}


O(2^n): Exponencial. O tempo de execução cresce exponencialmente com o tamanho da entrada.

// Exemplo: Algoritmo de Fibonacci recursivo
public int fibonacci(int n) 
{
    if (n <= 1) 
    {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}






 */