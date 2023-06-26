package busca;

public class BuscaBinaria {

    public static void main(String[] args) {
        
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
        }

        int elemento = 18;

        buscaBinaria(elemento, vetor);
    }

    private static void buscaBinaria(int elemento, int[] vetor) {
        int inicio = 0;
        int ultimo = vetor.length - 1;
        int meio;

        while (inicio <= ultimo) {
            meio = (int) ((inicio + ultimo) / 2);
            if (vetor[meio] == elemento) {
                System.out.println("Elemento encontrado na posição: " + meio);
                return;
            } else if (vetor[meio] < elemento) {
                inicio = meio + 1;
            } else { // só pode ser maior
                ultimo = meio - 1;
            }
        }

        System.out.println("Elemento não encontrado...");
    }
    
}
