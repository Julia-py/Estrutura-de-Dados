package LEncadeada;

public class Main {
    public static void main(String[] args) {

        Encadeada lista = new Encadeada();

        // 1. Adiciona 4 elementos
        lista.Adicionar(10);
        lista.Adicionar(20);
        lista.Adicionar(30);
        lista.Adicionar(40);

        // Mostra a lista inicial
        System.out.println("Lista inicial:");
        for (int i = 0; i < lista.Size(); i++) {
            System.out.print(lista.get(i).getValor() + " -> ");
        }
        System.out.println("null");

        // 2. Remove um elemento (ex: índice 2)
        lista.Remover(2);

        System.out.println("\nApós remover índice 2:");
        for (int i = 0; i < lista.Size(); i++) {
            System.out.print(lista.get(i).getValor() + " -> ");
        }
        System.out.println("null");

        // 3. Adiciona no final
        lista.Adicionar(50);

        System.out.println("\nApós adicionar 50 no final:");
        for (int i = 0; i < lista.Size(); i++) {
            System.out.print(lista.get(i).getValor() + " -> ");
        }
        System.out.println("null");

        System.out.println("\nLista Final:");
        for (int i = 0; i < lista.Size(); i++) {
            System.out.print(lista.get(i).getValor() + " -> ");
        }
        System.out.println("null");
    }
}