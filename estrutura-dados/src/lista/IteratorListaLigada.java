package lista;

public class IteratorListaLigada<T> {
    
    private No<T> valor;

    public IteratorListaLigada(No<T> valor) {
        this.valor = valor;
    }

    public boolean temProximo() {
        if (valor.getProximo() == null) return false;
        return true;
    }

    public No<T> getProximo() {
        valor = valor.getProximo();
        return valor;
    }

    
}
