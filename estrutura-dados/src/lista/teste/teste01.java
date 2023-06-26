package lista.teste;

import lista.ListaLigada;

public class teste01 {

    public static void main(String[] args) {

        ListaLigada<Integer> lista = new ListaLigada<>();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(4);

        System.out.println("Tamanho: " + lista.getTamanho());
        System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
        System.out.println("Ultimo: " + lista.getUltimo().getValor());

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }

        lista.remover(4);
        System.out.println("Tamanho: " + lista.getTamanho());

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }

        lista.remover(1);
        System.out.println("Tamanho: " + lista.getTamanho());
        
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }

        System.out.println("Removendo todos...");
        lista.remover(2);
        lista.remover(3);

        System.out.println("Tamanho: " + lista.getTamanho());
        
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }

    }
}
