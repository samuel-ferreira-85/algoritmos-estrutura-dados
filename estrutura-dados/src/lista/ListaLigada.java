package lista;

public class ListaLigada<T> {
    
    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;

    

    public ListaLigada() {
        tamanho = 0;
    }

    public void adicionar(T valor) {
        No<T> novoNo = new No<>(valor);
        if (primeiro == null && ultimo == null) {
            primeiro = novoNo;
            ultimo = novoNo;            
        } else {
            ultimo.setProximo(novoNo);
            ultimo = novoNo;            
        }
        tamanho++;
    }

    public void remover(T valor) {
        No<T> anterior = null;
        No<T> atual = primeiro;

        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equals(valor)) {
                if (tamanho == 1) {
                    primeiro = null;
                    ultimo = null;
                } else if(atual == primeiro) {
                    primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if(atual == ultimo) {
                    ultimo = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public No<T> get(int posicao) {
        No<T> atual = primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
         return atual;
    }

    public No<T> getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(No<T> primeiro) {
        this.primeiro = primeiro;
    }
    public No<T> getUltimo() {
        return ultimo;
    }
    public void setUltimo(No<T> ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return tamanho;
    }


     
}
