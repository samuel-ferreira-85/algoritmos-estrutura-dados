package recursividade;

public class Fibonacci {

    public static void main(String[] args) {
        
        int quantidade = 20;

        imprimeFibonacci(quantidade);

    }

    private static void imprimeFibonacci(int quantidade) {
        System.out.print("\nSequência Fibonacci com " + quantidade + " posições: ");
       
        for (int i = 0; i < quantidade; i++) System.out.print(fibonacci(i) + " ");     
       
        System.out.println("\n");
    }

    private static int fibonacci(int posicao) {
        if (posicao == 0) return 0;
        else if (posicao <= 2) return 1;
        else {
            return fibonacci(posicao - 1) + fibonacci(posicao - 2);            
        }
    }
    
}
