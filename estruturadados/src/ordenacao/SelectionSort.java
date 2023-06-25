package ordenacao;

public class SelectionSort {
    
    public static void main(String[] args) {
        int[] vetor = new int[5];

        System.out.println("Vetor desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 20);
            System.out.println(vetor[i]);            
        }

        selectionSort(vetor); 
    }
//  Selection Sort é de O(N^2)
    private static void selectionSort(int[] vetor) {

        int posicaoMenor, aux;
        for (int i = 0; i < vetor.length; i++) { // O(N)
            posicaoMenor = i;
            for (int j = i+1; j < vetor.length; j++) { // O(N)
                if (vetor[j] < vetor[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            aux = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = aux;
        }

        System.out.println("\n\nVetor Ordenado:");
        for (int i = 0; i < vetor.length; i++) {            
            System.out.println(vetor[i]);            
        }
    }
}
