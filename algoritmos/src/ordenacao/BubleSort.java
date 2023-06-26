package ordenacao;

public class BubleSort {

    public static void main(String[] args) {
        
        int[] vetor = new int[8];

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);            
        }

        bubleSort(vetor);        
    }

    private static void bubleSort(int[] vetor) { // O(N^2)
        int aux;
        for (int i = 0; i < vetor.length; i++) { //O(N)
            for (int j = i+1; j < vetor.length; j++) { //O(N-1)
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado...");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
    
}
