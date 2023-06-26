package recursividade;

public class Recursividade {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[5];

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);            
        }

        System.out.println("\n\nSoma do vetor = " + somar(0, 0, vetor));
    }

    private static int somar(int soma, int posicao, int[] vetor) {
        if ( posicao < vetor.length) {
            soma = soma + vetor[posicao];
            return somar(soma, posicao + 1, vetor);
        } 
        return soma;             
    }
}
