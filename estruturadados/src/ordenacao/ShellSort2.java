package ordenacao;

public class ShellSort2 {
    
    public static void main(String[] args) {
        
        int[] vetor = {10, 5, 3, 6, 8, 4, 2, 9};

        shellSort(vetor);
    }

    private static void shellSort(int[] vetor) {

        int i, j, aux, h;

        h = vetor.length / 2; // 8 / 2 = 4

        System.out.println("Valor de h: " + h);
        System.out.print("Vetor: ");

        for (i = 0; i < vetor.length; i++) {      // imprime o vetor      
            System.out.print(vetor[i] + " "); 
        } 
        System.out.println("\n");   

        while (h > 0) { // enquanto h for maior 0 ele roda

            for (i = h; i < vetor.length; i++) { // inicia no valor de h = 4 e roda enquanto for menor que o tamanho
                aux = vetor[i]; // coloco na variavel auxiliar o valor da posição i (4) do vetor = 8

                for (j = i - h; ((j >= 0) && (vetor[j] > aux)); j -=  h) {  
                    vetor[j+h] = vetor[j];
                }

                vetor[j+h] = aux;
            }

            h /= 2; 
            
            System.out.println("Valor de h: " + h);
            System.out.print("Vetor: ");
            for (i = 0; i < vetor.length; i++) {            
                System.out.print(vetor[i] + " "); 
            } 
            System.out.println("\n");          
        }
        
    }
}
