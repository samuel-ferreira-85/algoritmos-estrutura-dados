package ordenacao;

public class HeapSort {

     public static void main(String[] args) {
        
        int[] vetor = {3, 6, 5, 10, 2, 8, 7, 1};

        System.out.print("Desordenado - ");
        imprimeVetor(vetor);

        heapSort(vetor);

        System.out.print("\n\nOrdenado - ");
        imprimeVetor(vetor);
     }

    private static void heapSort(int[] vetor) {

        int n = vetor.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            aplicarHeap(vetor, n, i);
        }

        System.out.print("\n\nQuase ordenado - ");
        imprimeVetor(vetor);

        for(int j = n-1; j > 0; j--){
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;
            
            aplicarHeap(vetor, j, 0);
        }
    }

    private static void aplicarHeap(int[] vetor, int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }
        
        if (raiz != i){
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;
            
            aplicarHeap(vetor, n, raiz);
        }
    }

    private static void imprimeVetor(int[] vetor) {

        System.out.print("Vetor: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
