package busca;

public class BuscaLinear {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);            
        }

        buscaLinear(2, vetor);        

    }

    private static void buscaLinear(int valorBuscado, int[] vetor) {
        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorBuscado) {
                System.out.println("O valor encontrado na posição: " + i);           
                return;
            }    
        }
        System.out.println("Valor não encontrado!"); 

    }
}
