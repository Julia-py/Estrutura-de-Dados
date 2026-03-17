package LDEncadeada;

public class main {
    public static void main(String[] args) {
        // Criar lista duplamente encadeada
        DEncadeada lista = new DEncadeada();

        // Inserir elementos
        lista.Inserir(10, 0); // início
        lista.Inserir(20, 1); // final
        lista.Inserir(30, 2); // final
        lista.Inserir(25, 2); // meio
        lista.Inserir(60,2);

        System.out.print("Lista inicial: ");
        mostrarLista(lista);

        // Excluir elemento do meio (índice 2, que é 25)
        lista.Excluir(2);
        System.out.print("Após remover índice 2: ");
        mostrarLista(lista);

        // Adicionar no final
        lista.Inserir(40, lista.TSize());
        System.out.print("Após adicionar 40 no final: ");
        mostrarLista(lista);

        lista.Inserir(5, lista.TSize());
    }

    // Método que mostrar lista do início
    public static void mostrarLista(DEncadeada lista) {
        No atual = lista.get(0);
        for (int i = 0; i < lista.TSize(); i++) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}


