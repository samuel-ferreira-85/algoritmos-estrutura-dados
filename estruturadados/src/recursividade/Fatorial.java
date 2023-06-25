package recursividade;

public class Fatorial {
    
    public static void main(String[] args) {
        
        int n = 10;

        System.out.println(fatorial(n));
        
    }

    private static int fatorial(int n) { 
        int total; 
        
        if (n >= 2) {
            total = n * fatorial(n-1);
            return total;
        } else if (n == 0 || n == 1) return 1; 
        return 0;              
    }    
}
